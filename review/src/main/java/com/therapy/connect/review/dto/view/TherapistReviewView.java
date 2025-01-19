package com.therapy.connect.review.dto.view;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
public class TherapistReviewView extends ReviewView {

    @NonNull
    private UUID therapistId;
}
