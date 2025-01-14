package com.therapy.connect.review.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "blog_review", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"therapistId", "authorId"})
})
public class TherapistReviewEntity extends ReviewEntity {

    @NonNull
    private UUID therapistId;
}
