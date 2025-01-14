package com.therapy.connect.util.constants;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProjectConstants {

    public static final String USER_SERVICE = "user";
    public static final String BLOG_SERVICE = "blog";
    public static final String REVIEW_SERVICE = "review";

    public static final String USER_SERVICE_BASE_PATH = "/api/user";
    public static final String BLOG_SERVICE_BASE_PATH = "/api/blog";
    public static final String REVIEW_SERVICE_BASE_PATH = "/api/review";
}
