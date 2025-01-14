package com.therapy.connect.core.db_loader;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CoreDbConstants {

    public static final UUID THERAPIST_1_ID = UUID.fromString("826463df-518e-49e8-a13d-a3bb6b6ad4dc");
    public static final UUID PATIENT_1_ID = UUID.fromString("b30be664-9d18-4a65-80fd-67fb893bf7d0");

    public static final UUID BLOG_1_ID = UUID.fromString("0abf7b34-9f45-4e4d-b433-ca5c858997a3");
    public static final String BOLG_1_TITLE = "Blog 1";
    public static final String BLOG_1_CONTENT = "This is the content of Blog 1";
    public static final UUID BLOG_1_AUTHOR_ID = CoreDbConstants.THERAPIST_1_ID;

    public static final UUID BLOG_REVIEW_1_ID = UUID.fromString("c8751310-e12a-4b72-9d7c-bb31a97037ba");
    public static final String BLOG_REVIEW_1_COMMENT = "This is the comment of Blog 1";
    public static final int BLOG_REVIEW_1_RATING = 5;
    public static final UUID BLOG_REVIEW_1_AUTHOR_ID = CoreDbConstants.PATIENT_1_ID;
    public static final UUID BLOG_REVIEW_1_BLOG_ID = CoreDbConstants.BLOG_1_ID;

    public static final UUID THERAPIST_REVIEW_1_ID = UUID.fromString("1a40f8f1-8f02-4d2a-90f5-c74437a9179e");
    public static final String THERAPIST_REVIEW_1_COMMENT = "This is the comment of Blog 1";
    public static final int THERAPIST_REVIEW_1_RATING = 5;
    public static final UUID THERAPIST_REVIEW_1_AUTHOR_ID = CoreDbConstants.PATIENT_1_ID;
    public static final UUID THERAPIST_REVIEW_1_THERAPIST_ID = CoreDbConstants.THERAPIST_1_ID;
}
