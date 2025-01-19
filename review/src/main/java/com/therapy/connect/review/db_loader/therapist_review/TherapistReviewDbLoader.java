package com.therapy.connect.review.db_loader.therapist_review;

import com.therapy.connect.review.service.therapist.ITherapistReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.therapy.connect.review.db_loader.therapist_review.TherapistReviewDbModelConstants.getTherapistReview1;


@RequiredArgsConstructor
@Profile("local")
@Component
final class TherapistReviewDbLoader implements CommandLineRunner {

    private final ITherapistReviewService therapistReviewService;

    @Override
    public void run(String... args) throws Exception {
        therapistReviewService.save(getTherapistReview1());
    }
}
