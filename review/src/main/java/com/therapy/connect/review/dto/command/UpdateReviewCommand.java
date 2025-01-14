package com.therapy.connect.review.dto.command;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public abstract class UpdateReviewCommand {

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
