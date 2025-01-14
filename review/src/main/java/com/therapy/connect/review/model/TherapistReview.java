package com.therapy.connect.review.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder(toBuilder = true)
public class TherapistReview extends Review {

    @NonNull
    private UUID therapistId;
}
