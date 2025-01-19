package com.therapy.connect.blog.dto.command;

import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
public class CreateBlogCommand {

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NonNull
    private UUID author;
}
