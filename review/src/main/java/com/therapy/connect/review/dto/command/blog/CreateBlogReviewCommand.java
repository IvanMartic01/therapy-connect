package com.therapy.connect.review.dto.command.blog;

import com.therapy.connect.review.dto.command.CreateReviewCommand;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
public final class CreateBlogReviewCommand extends CreateReviewCommand {

    @NotEmpty
    private UUID blogId;
}
