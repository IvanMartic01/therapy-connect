package com.therapy.connect.review.db_loader.therapist_review;

import com.therapy.connect.core.db_loader.ReviewDbConstants;
import com.therapy.connect.review.model.TherapistReview;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TherapistReviewDbModelConstants {

    public static TherapistReview getTherapistReview1() {
        return TherapistReview.builder()
                .id(ReviewDbConstants.THERAPIST_REVIEW_1_ID)
                .comment(ReviewDbConstants.THERAPIST_REVIEW_1_COMMENT)
                .rating(ReviewDbConstants.THERAPIST_REVIEW_1_RATING)
                .authorId(ReviewDbConstants.THERAPIST_REVIEW_1_AUTHOR_ID)
                .therapistId(ReviewDbConstants.THERAPIST_REVIEW_1_THERAPIST_ID)
                .build();
    }
}
