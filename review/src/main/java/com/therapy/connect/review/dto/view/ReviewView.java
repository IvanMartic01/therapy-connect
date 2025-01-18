package com.therapy.connect.review.dto.view;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Getter
public abstract class ReviewView {

    @NonNull
    private UUID id;
    @NotEmpty
    private String comment;
    @Min(1)
    @Max(5)
    private int rating;
    @NonNull
    private UUID authorId;
}
