package com.therapy.connect.review.mapper.therapist;

import com.therapy.connect.review.dto.command.therapist.CreateTherapistReviewCommand;
import com.therapy.connect.review.dto.command.therapist.UpdateTherapistReviewCommand;
import com.therapy.connect.review.model.TherapistReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface TherapistReviewCommandMapper {

    @NonNull TherapistReview convert(@NonNull CreateTherapistReviewCommand command);
    @NonNull TherapistReview convert(@NonNull UpdateTherapistReviewCommand command);
}
