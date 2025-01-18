package com.therapy.connect.blog.mapper;

import com.therapy.connect.blog.dto.command.CreateBlogCommand;
import com.therapy.connect.blog.dto.command.UpdateBlogCommand;
import com.therapy.connect.blog.model.Blog;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface BlogCommandMapper {

    @NonNull Blog convert(@NonNull CreateBlogCommand command);

    @NonNull Blog convert(@NonNull UpdateBlogCommand command);
}
