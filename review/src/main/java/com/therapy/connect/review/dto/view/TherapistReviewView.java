package com.therapy.connect.review.dto.view;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
public class TherapistReviewView extends ReviewView {

    @NonNull
    private UUID therapistId;
}
