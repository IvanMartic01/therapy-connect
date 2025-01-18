package com.therapy.connect.review.db_loader.blog_review;


import com.therapy.connect.core.db_loader.ReviewDbConstants;
import com.therapy.connect.review.model.BlogReview;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
final class BlogDbModelConstants {

    public static BlogReview getBlogReview1() {
        return BlogReview.builder()
                .id(ReviewDbConstants.BLOG_REVIEW_1_ID)
                .comment(ReviewDbConstants.BLOG_REVIEW_1_COMMENT)
                .rating(ReviewDbConstants.BLOG_REVIEW_1_RATING)
                .authorId(ReviewDbConstants.BLOG_REVIEW_1_AUTHOR_ID)
                .blogId(ReviewDbConstants.BLOG_REVIEW_1_BLOG_ID)
                .build();
    }
}
