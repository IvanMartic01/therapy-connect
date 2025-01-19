package com.therapy.connect.blog.controller;

import com.therapy.connect.blog.dto.command.CreateBlogCommand;
import com.therapy.connect.blog.dto.command.UpdateBlogCommand;
import com.therapy.connect.blog.dto.view.BlogView;
import com.therapy.connect.blog.mapper.BlogCommandMapper;
import com.therapy.connect.blog.mapper.BlogViewMapper;
import com.therapy.connect.blog.model.Blog;
import com.therapy.connect.blog.service.IBlogService;
import com.therapy.connect.util.constants.ProjectConstants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping(ProjectConstants.BLOG_SERVICE_BASE_PATH)
public class BlogController {

    private final BlogViewMapper blogViewMapper;
    private final BlogCommandMapper blogCommandMapper;
    private final IBlogService blogService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Collection<BlogView> getAll() {
        return blogService.getAll().stream()
                .map(blogViewMapper::convert)
                .toList();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public BlogView getById(@PathVariable UUID id) {
        Blog foundBlog = blogService.getById(id);
        return blogViewMapper.convert(foundBlog);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public BlogView save(@Valid @RequestBody CreateBlogCommand command) {
        Blog newBlog = blogCommandMapper.convert(command);
        Blog savedBlog = blogService.save(newBlog);
        return blogViewMapper.convert(savedBlog);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public BlogView update(@Valid @RequestBody UpdateBlogCommand command) {
        Blog blogToUpdate = blogCommandMapper.convert(command);
        Blog updatedBlog = blogService.update(blogToUpdate);
        return blogViewMapper.convert(updatedBlog);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        blogService.delete(id);
    }
}
