package com.therapy.connect.core.db_loader;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public final class BlogDbConstants {

    public static final UUID BLOG_1_ID = UUID.fromString("0abf7b34-9f45-4e4d-b433-ca5c858997a3");
    public static final String BOLG_1_TITLE = "Blog 1";
    public static final String BLOG_1_CONTENT = "This is the content of Blog 1";
    public static final UUID BLOG_1_AUTHOR_ID = UserDbConstants.PATIENT_1_ID;
}
