package com.therapy.connect.review.db_loader;

import com.therapy.connect.core.db_loader.CoreDbConstants;
import com.therapy.connect.review.model.BlogReview;
import com.therapy.connect.review.service.blog.IBlogReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class BlogReviewDbLoader implements CommandLineRunner {

    private final IBlogReviewService blogReviewService;


    @Override
    public void run(String... args) throws Exception {
        BlogReview blogReview1 = getBlogReview();
        blogReviewService.save(blogReview1);
    }

    private BlogReview getBlogReview() {
        return BlogReview.builder()
                .id(CoreDbConstants.BLOG_REVIEW_1_ID)
                .comment(CoreDbConstants.BLOG_REVIEW_1_COMMENT)
                .rating(CoreDbConstants.BLOG_REVIEW_1_RATING)
                .authorId(CoreDbConstants.BLOG_REVIEW_1_AUTHOR_ID)
                .blogId(CoreDbConstants.BLOG_REVIEW_1_BLOG_ID)
                .build();
    }
}
