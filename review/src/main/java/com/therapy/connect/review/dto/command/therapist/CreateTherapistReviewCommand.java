package com.therapy.connect.review.dto.command.therapist;

import com.therapy.connect.review.dto.command.CreateReviewCommand;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
public class CreateTherapistReviewCommand extends CreateReviewCommand {

    @NotEmpty
    private UUID therapistId;
}
