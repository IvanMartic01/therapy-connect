package com.therapy.connect.review.dto.command.therapist;

import com.therapy.connect.review.dto.command.UpdateReviewCommand;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
public class UpdateTherapistReviewCommand extends UpdateReviewCommand {

    @NotEmpty
    private UUID therapistId;
}
