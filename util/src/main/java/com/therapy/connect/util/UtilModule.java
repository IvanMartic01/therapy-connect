package com.therapy.connect.util;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static com.therapy.connect.util.UtilModule.BASE_PACKAGE;

@AutoConfiguration
@ComponentScan(basePackages = BASE_PACKAGE)
public class UtilModule {

    public static final String BASE_PACKAGE = "com.therapy.connect";
}
