package com.therapy.connect.user;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("user"),
    ADMIN("admin");

    @JsonValue
    private final String value;

    public static Role of(String value) {
        for (Role role : values()) {
            if (role.getValue().equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No such role: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
