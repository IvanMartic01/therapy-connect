package com.therapy.connect.blog.db_loader;

import com.therapy.connect.blog.service.IBlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.therapy.connect.blog.db_loader.BlogDbModelConstants.buildBlog1;

@RequiredArgsConstructor
@Profile("local")
@Component
final class BlogDbLoader implements CommandLineRunner {

    private final IBlogService blogService;

    @Override
    public void run(String... args) {
        blogService.save(buildBlog1());
    }
}
