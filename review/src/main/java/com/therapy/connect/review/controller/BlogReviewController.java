package com.therapy.connect.review.controller;

import com.therapy.connect.review.dto.command.blog.CreateBlogReviewCommand;
import com.therapy.connect.review.dto.command.blog.UpdateBlogReviewCommand;
import com.therapy.connect.review.dto.view.BlogReviewView;
import com.therapy.connect.review.mapper.blog.BlogReviewCommandMapper;
import com.therapy.connect.review.mapper.blog.BlogReviewViewMapper;
import com.therapy.connect.review.model.BlogReview;
import com.therapy.connect.review.service.blog.IBlogReviewService;
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
@RequestMapping(ProjectConstants.REVIEW_SERVICE_BASE_PATH + "/blog-review")
final class BlogReviewController {

    private final IBlogReviewService blogReviewService;
    private final BlogReviewCommandMapper blogReviewCommandMapper;
    private final BlogReviewViewMapper blogReviewViewMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Collection<BlogReviewView> getBlogReviews() {
        return blogReviewService.findAll().stream()
                .map(blogReviewViewMapper::convert)
                .toList();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public BlogReviewView getById(@PathVariable UUID id) {
        BlogReview blogReview = blogReviewService.findById(id);
        return blogReviewViewMapper.convert(blogReview);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public BlogReviewView save(@Valid @RequestBody CreateBlogReviewCommand command) {
        BlogReview blogReview = blogReviewCommandMapper.convert(command);
        BlogReview savedBlogReview = blogReviewService.save(blogReview);
        return blogReviewViewMapper.convert(savedBlogReview);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public BlogReviewView update(@Valid @RequestBody UpdateBlogReviewCommand command) {
        BlogReview blogReview = blogReviewCommandMapper.convert(command);
        BlogReview updatedBlogReview = blogReviewService.update(blogReview);
        return blogReviewViewMapper.convert(updatedBlogReview);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        blogReviewService.deleteById(id);
    }
}
