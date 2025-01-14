package com.therapy.connect.review.dto.view;

import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
public class TherapistReviewView extends ReviewView {

    @NonNull
    private UUID therapistId;
}
