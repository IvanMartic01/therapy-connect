package com.therapy.connect.blog.dto.view;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public class BlogView {

    @NonNull
    private UUID id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NonNull
    private UUID author;
}
