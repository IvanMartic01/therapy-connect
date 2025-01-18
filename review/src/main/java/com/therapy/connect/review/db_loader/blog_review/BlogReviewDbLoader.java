package com.therapy.connect.review.db_loader.blog_review;

import com.therapy.connect.review.service.blog.IBlogReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.therapy.connect.review.db_loader.blog_review.BlogDbModelConstants.getBlogReview1;


@RequiredArgsConstructor
@Component
class BlogReviewDbLoader implements CommandLineRunner {

    private final IBlogReviewService blogReviewService;

    @Override
    public void run(String... args) throws Exception {
        blogReviewService.save(getBlogReview1());
    }
}
