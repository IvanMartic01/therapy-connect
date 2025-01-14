package com.therapy.connect.review.repository;

import com.therapy.connect.review.entity.BlogReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogReviewRepository extends JpaRepository<BlogReviewEntity, UUID> {
}
