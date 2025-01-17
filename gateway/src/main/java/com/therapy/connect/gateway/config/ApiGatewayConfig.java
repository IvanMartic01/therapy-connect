package com.therapy.connect.gateway.config;

import com.therapy.connect.util.constants.ProjectConstants;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator routeConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p.path(ProjectConstants.BLOG_SERVICE_BASE_PATH + "/**")
                        .uri("lb://" + ProjectConstants.BLOG_SERVICE))
                .route(p -> p.path( ProjectConstants.REVIEW_SERVICE_BASE_PATH + "/**")
                        .uri("lb://" + ProjectConstants.REVIEW_SERVICE))
                .build();
    }
}
