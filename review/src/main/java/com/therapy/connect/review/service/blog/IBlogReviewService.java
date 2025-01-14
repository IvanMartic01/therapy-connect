package com.therapy.connect.review.service.blog;

import com.therapy.connect.review.model.BlogReview;
import lombok.NonNull;

import java.util.Collection;
import java.util.UUID;

public interface IBlogReviewService {

    @NonNull Collection<BlogReview> findAll();

    @NonNull BlogReview findById(@NonNull UUID id);

    @NonNull BlogReview save(@NonNull BlogReview review);

    @NonNull BlogReview update(@NonNull BlogReview review);

    void deleteById(@NonNull UUID id);
}
