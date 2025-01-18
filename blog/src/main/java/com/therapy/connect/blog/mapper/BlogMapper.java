package com.therapy.connect.blog.mapper;

import com.therapy.connect.blog.entity.BlogEntity;
import com.therapy.connect.blog.model.Blog;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogMapper {

    @NonNull BlogEntity convert(@NonNull Blog model);

    @NonNull Blog convert(@NonNull BlogEntity entity);
}
