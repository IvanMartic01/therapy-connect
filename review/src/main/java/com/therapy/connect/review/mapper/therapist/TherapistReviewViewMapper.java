package com.therapy.connect.review.mapper.therapist;

import com.therapy.connect.review.dto.view.TherapistReviewView;
import com.therapy.connect.review.model.TherapistReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface TherapistReviewViewMapper {

    @NonNull TherapistReviewView convert(@NonNull TherapistReview model);
}
