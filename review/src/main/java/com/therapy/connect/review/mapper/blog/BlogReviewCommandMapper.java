package com.therapy.connect.review.mapper.blog;

import com.therapy.connect.review.dto.command.blog.CreateBlogReviewCommand;
import com.therapy.connect.review.dto.command.blog.UpdateBlogReviewCommand;
import com.therapy.connect.review.model.BlogReview;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogReviewCommandMapper {

    @NonNull BlogReview convert(@NonNull CreateBlogReviewCommand command);
    @NonNull BlogReview convert(@NonNull UpdateBlogReviewCommand command);
}
