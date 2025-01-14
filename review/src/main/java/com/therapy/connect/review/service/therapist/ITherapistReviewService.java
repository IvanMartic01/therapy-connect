package com.therapy.connect.review.service.therapist;

import com.therapy.connect.review.model.TherapistReview;
import lombok.NonNull;

import java.util.Collection;
import java.util.UUID;

public interface ITherapistReviewService {

    @NonNull Collection<TherapistReview> findAll();

    @NonNull TherapistReview findById(@NonNull UUID id);

    @NonNull TherapistReview save(@NonNull TherapistReview review);

    @NonNull TherapistReview update(@NonNull TherapistReview review);

    void deleteById(@NonNull UUID id);
}
