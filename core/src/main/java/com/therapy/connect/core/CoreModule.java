package com.therapy.connect.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static com.therapy.connect.core.CoreModule.BASE_PACKAGE;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@AutoConfiguration
@ComponentScan(basePackages = BASE_PACKAGE)
public class CoreModule {

    static final String BASE_PACKAGE = "com.therapy.connect";
}
