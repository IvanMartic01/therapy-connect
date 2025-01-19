package com.therapy.connect.blog.db_loader;

import com.therapy.connect.blog.service.IBlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

@RequiredArgsConstructor
@ActiveProfiles("test")
@Component
public class TestBlogDbLoader implements CommandLineRunner {

    private final IBlogService blogService;

    @Override
    public void run(String... args) throws Exception {
        blogService.save(TestBlogDbModelConstants.buildBlog1());

    }
}
