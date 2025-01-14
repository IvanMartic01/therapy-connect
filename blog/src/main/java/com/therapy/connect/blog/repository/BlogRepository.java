package com.therapy.connect.blog.repository;

import com.therapy.connect.blog.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogRepository extends JpaRepository<BlogEntity, UUID> {
}
