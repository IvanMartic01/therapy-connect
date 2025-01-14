package com.therapy.connect.review.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder(toBuilder = true)
public abstract class Review {

    @NonNull
    private UUID id;
    @Min(1)
    @Max(5)
    private int rating;
    @NotEmpty
    private String comment;
    @NonNull
    private UUID authorId;
}
