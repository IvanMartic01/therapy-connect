package com.therapy.connect.blog.controller;


import com.therapy.connect.blog.AbstractIntegrationTest;
import com.therapy.connect.blog.db_loader.TestBlogDbModelConstants;
import com.therapy.connect.blog.dto.view.BlogView;
import com.therapy.connect.blog.model.Blog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;


@ActiveProfiles("test")
class BlogControllerTest extends AbstractIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("Test case: Get book")
    void shouldReturnUserByIdWhenUserExists() throws Exception {
        Blog blog = TestBlogDbModelConstants.buildBlog1();
        ResponseEntity<BlogView> response = testRestTemplate.getForEntity("/api/blog/" + blog.getId(), BlogView.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getTitle()).isEqualTo(blog.getTitle());
        assertThat(response.getBody().getContent()).isEqualTo(blog.getContent());
        assertThat(response.getBody().getAuthor()).isEqualTo(blog.getAuthor());
        assertThat(response.getBody().getId()).isEqualTo(blog.getId());
    }
}
