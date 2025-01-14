package com.therapy.connect.blog.controller;

import com.therapy.connect.util.constants.ProjectConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(ProjectConstants.BLOG_SERVICE_BASE_PATH + "/info")
public class InfoController {

    @Value("${build.version}")
    private String buildVersion;

    @Value("${message}")
    private String message;

    @GetMapping
    public String getInfo() {
        return "Blog Service, version: " + buildVersion + ", message: " + message;
    }
}
