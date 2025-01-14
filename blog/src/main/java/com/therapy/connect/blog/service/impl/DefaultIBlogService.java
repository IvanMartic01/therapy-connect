package com.therapy.connect.blog.service.impl;

import com.therapy.connect.blog.entity.BlogEntity;
import com.therapy.connect.blog.mapper.BlogMapper;
import com.therapy.connect.blog.model.Blog;
import com.therapy.connect.blog.repository.BlogRepository;
import com.therapy.connect.blog.service.IBlogService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Transactional
@RequiredArgsConstructor
@Service
class DefaultIBlogService implements IBlogService {

    private final BlogRepository blogRepository;
    private final BlogMapper blogMapper;

    @Override
    public @NonNull Collection<Blog> getAll() {
        return blogRepository.findAll().stream()
                .map(blogMapper::convert)
                .toList();
    }

    @Override
    public @NonNull Blog getById(@NonNull UUID id) {
        return blogRepository.findById(id)
                .map(blogMapper::convert)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public @NonNull Blog save(@NonNull Blog newBlog) {
        BlogEntity blogToSave = blogMapper.convert(newBlog);
        BlogEntity savedBlog = blogRepository.save(blogToSave);
        return blogMapper.convert(savedBlog);
    }

    @Override
    public @NonNull Blog update(@NonNull Blog blog) {
        BlogEntity blogToUpdate = blogMapper.convert(blog);
        BlogEntity updatedBlog = blogRepository.save(blogToUpdate);
        return blogMapper.convert(updatedBlog);
    }

    @Override
    public void delete(@NonNull UUID id) {
        blogRepository.deleteById(id);
    }
}
