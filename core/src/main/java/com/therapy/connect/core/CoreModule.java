package com.therapy.connect.core;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static com.therapy.connect.core.CoreModule.BASE_PACKAGE;

@AutoConfiguration
@ComponentScan(basePackages = BASE_PACKAGE)
public class CoreModule {

    static final String BASE_PACKAGE = "com.therapy.connect";

}
