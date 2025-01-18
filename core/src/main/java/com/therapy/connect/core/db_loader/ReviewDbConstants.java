package com.therapy.connect.core.db_loader;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ReviewDbConstants {

    public static final UUID BLOG_REVIEW_1_ID = UUID.fromString("c8751310-e12a-4b72-9d7c-bb31a97037ba");
    public static final String BLOG_REVIEW_1_COMMENT = "This is the comment of Blog 1";
    public static final int BLOG_REVIEW_1_RATING = 5;
    public static final UUID BLOG_REVIEW_1_AUTHOR_ID = UserDbConstants.PATIENT_1_ID;
    public static final UUID BLOG_REVIEW_1_BLOG_ID = BlogDbConstants.BLOG_1_ID;

    public static final UUID THERAPIST_REVIEW_1_ID = UUID.fromString("1a40f8f1-8f02-4d2a-90f5-c74437a9179e");
    public static final String THERAPIST_REVIEW_1_COMMENT = "This is the comment of Blog 1";
    public static final int THERAPIST_REVIEW_1_RATING = 5;
    public static final UUID THERAPIST_REVIEW_1_AUTHOR_ID = UserDbConstants.PATIENT_1_ID;
    public static final UUID THERAPIST_REVIEW_1_THERAPIST_ID = UserDbConstants.THERAPIST_1_ID;
}
