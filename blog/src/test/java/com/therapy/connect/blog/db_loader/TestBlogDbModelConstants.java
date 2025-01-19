package com.therapy.connect.blog.db_loader;

import com.therapy.connect.blog.model.Blog;
import com.therapy.connect.core.db_loader.BlogDbConstants;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestBlogDbModelConstants {

    public static Blog buildBlog1() {
        return Blog.builder()
                .id(BlogDbConstants.BLOG_1_ID)
                .title(BlogDbConstants.BOLG_1_TITLE)
                .content(BlogDbConstants.BLOG_1_CONTENT)
                .author(BlogDbConstants.BLOG_1_AUTHOR_ID)
                .build();
    }
}
