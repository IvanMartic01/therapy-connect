package com.therapy.connect.blog.dto.command;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
public class CreateBlogCommand {

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NonNull
    private UUID author;
}
