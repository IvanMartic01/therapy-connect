package com.therapy.connect.review.entity;


import com.therapy.connect.core.entity.BaseEntity;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public class ReviewEntity extends BaseEntity {

    @NotEmpty
    private String comment;
    @Min(1)
    @Max(5)
    private int rating;
    @NonNull
    private UUID authorId;
}
