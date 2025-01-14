package com.therapy.connect.blog.db_loader;

import com.therapy.connect.blog.model.Blog;
import com.therapy.connect.blog.service.IBlogService;
import com.therapy.connect.core.db_loader.CoreDbConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BlogDbLoader implements CommandLineRunner {

    private final IBlogService blogService;

    @Override
    public void run(String... args) {
        Blog blog1 = getBlog1();
        blogService.save(blog1);
    }

    private Blog getBlog1() {
        return Blog.builder()
                .id(CoreDbConstants.BLOG_1_ID)
                .title(CoreDbConstants.BOLG_1_TITLE)
                .content(CoreDbConstants.BLOG_1_CONTENT)
                .author(CoreDbConstants.BLOG_1_AUTHOR_ID)
                .build();
    }
}
