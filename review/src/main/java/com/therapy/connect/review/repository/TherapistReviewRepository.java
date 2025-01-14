package com.therapy.connect.review.repository;

import com.therapy.connect.review.entity.TherapistReviewEntity;
import com.therapy.connect.review.model.TherapistReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TherapistReviewRepository extends JpaRepository<TherapistReviewEntity, UUID> {
}
