package com.therapy.connect.blog.mapper;

import com.therapy.connect.blog.model.Blog;
import com.therapy.connect.blog.dto.view.BlogView;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogViewMapper {

    @NonNull BlogView convert(@NonNull Blog model);
}
