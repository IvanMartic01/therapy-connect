package com.therapy.connect.blog.entity;

import com.therapy.connect.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "blog")
public class BlogEntity extends BaseEntity {

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NonNull
    private UUID author;
}
