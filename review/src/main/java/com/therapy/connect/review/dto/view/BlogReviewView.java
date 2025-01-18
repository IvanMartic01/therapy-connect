package com.therapy.connect.review.dto.view;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Getter
public class BlogReviewView extends ReviewView {

    @NonNull
    private UUID blogId;
}
