package com.therapy.connect.core.db_loader;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserDbConstants {

    public static final UUID THERAPIST_1_ID = UUID.fromString("826463df-518e-49e8-a13d-a3bb6b6ad4dc");
    public static final UUID PATIENT_1_ID = UUID.fromString("b30be664-9d18-4a65-80fd-67fb893bf7d0");
}
