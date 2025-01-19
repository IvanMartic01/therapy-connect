package com.therapy.connect.review.dto.view;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class BlogReviewView extends ReviewView {

    @NonNull
    private UUID blogId;
}
