package com.therapy.connect.blog.service;

import com.therapy.connect.blog.model.Blog;
import lombok.NonNull;

import java.util.Collection;
import java.util.UUID;

public interface IBlogService {

    @NonNull Collection<Blog> getAll();

    @NonNull Blog getById(@NonNull UUID id);

    @NonNull Blog save(@NonNull Blog newBlog);

    @NonNull Blog update(@NonNull Blog blog);

    void delete(@NonNull UUID id);
}
