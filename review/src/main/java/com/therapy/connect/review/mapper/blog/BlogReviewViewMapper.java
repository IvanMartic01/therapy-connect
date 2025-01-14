package com.therapy.connect.review.mapper.blog;

import com.therapy.connect.review.dto.view.BlogReviewView;
import com.therapy.connect.review.model.BlogReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogReviewViewMapper {

    @NonNull BlogReviewView convert(@NonNull BlogReview model);
}
