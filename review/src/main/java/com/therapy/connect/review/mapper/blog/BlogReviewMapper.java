package com.therapy.connect.review.mapper.blog;

import com.therapy.connect.review.entity.BlogReviewEntity;
import com.therapy.connect.review.model.BlogReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogReviewMapper {

    @NonNull BlogReview convert(@NonNull BlogReviewEntity entity);
    @NonNull BlogReviewEntity convert(@NonNull BlogReview model);
}
