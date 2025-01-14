package com.therapy.connect.review.db_loader;

import com.therapy.connect.core.db_loader.CoreDbConstants;
import com.therapy.connect.review.model.TherapistReview;
import com.therapy.connect.review.service.therapist.ITherapistReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class TherapistReviewDbLoader implements CommandLineRunner {

    private final ITherapistReviewService therapistReviewService;

    @Override
    public void run(String... args) throws Exception {
        TherapistReview therapistReview1 = getTherapistReview1();
        therapistReviewService.save(therapistReview1);
    }

    private TherapistReview getTherapistReview1() {
        return TherapistReview.builder()
                .id(CoreDbConstants.THERAPIST_REVIEW_1_ID)
                .comment(CoreDbConstants.THERAPIST_REVIEW_1_COMMENT)
                .rating(CoreDbConstants.THERAPIST_REVIEW_1_RATING)
                .authorId(CoreDbConstants.THERAPIST_REVIEW_1_AUTHOR_ID)
                .therapistId(CoreDbConstants.THERAPIST_REVIEW_1_THERAPIST_ID)
                .build();
    }
}
