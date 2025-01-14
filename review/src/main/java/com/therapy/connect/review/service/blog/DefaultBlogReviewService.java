package com.therapy.connect.review.service.blog;

import com.therapy.connect.review.entity.BlogReviewEntity;
import com.therapy.connect.review.mapper.blog.BlogReviewMapper;
import com.therapy.connect.review.model.BlogReview;
import com.therapy.connect.review.repository.BlogReviewRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@RequiredArgsConstructor
@Service
class DefaultBlogReviewService implements IBlogReviewService {

    private final BlogReviewRepository blogReviewRepository;
    private final BlogReviewMapper blogReviewMapper;

    @Override
    public @NonNull Collection<BlogReview> findAll() {
        return blogReviewRepository.findAll().stream()
                .map(blogReviewMapper::convert)
                .toList();
    }

    @Override
    public @NonNull BlogReview findById(@NonNull UUID id) {
        return blogReviewRepository.findById(id)
                .map(blogReviewMapper::convert)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public @NonNull BlogReview save(@NonNull BlogReview review) {
        BlogReviewEntity reviewToSave = blogReviewMapper.convert(review);
        BlogReviewEntity savedBlogReview = blogReviewRepository.save(reviewToSave);
        return blogReviewMapper.convert(savedBlogReview);
    }

    @Override
    public @NonNull BlogReview update(@NonNull BlogReview review) {
        BlogReviewEntity reviewToUpdate = blogReviewMapper.convert(review);
        BlogReviewEntity updatedBlogReview = blogReviewRepository.save(reviewToUpdate);
        return blogReviewMapper.convert(updatedBlogReview);
    }

    @Override
    public void deleteById(@NonNull UUID id) {
        blogReviewRepository.deleteById(id);
    }
}
