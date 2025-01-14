package com.therapy.connect.blog.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@Builder(toBuilder = true)
public class Blog {

    private UUID id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NonNull
    private UUID author;
}
