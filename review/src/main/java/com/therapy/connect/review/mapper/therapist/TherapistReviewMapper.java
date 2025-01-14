package com.therapy.connect.review.mapper.therapist;

import com.therapy.connect.review.entity.TherapistReviewEntity;
import com.therapy.connect.review.model.TherapistReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface TherapistReviewMapper {

    @NonNull TherapistReview convert(@NonNull TherapistReviewEntity entity);
    @NonNull TherapistReviewEntity convert(@NonNull TherapistReview model);
}
