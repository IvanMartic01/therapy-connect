package com.therapy.connect.review.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder(toBuilder = true)
public class BlogReview extends Review {

    @NonNull
    private UUID blogId;
}
