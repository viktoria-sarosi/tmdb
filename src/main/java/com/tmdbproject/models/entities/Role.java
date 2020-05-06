package com.tmdbproject.models.entities;

public enum Role {

    USER("user"),
    ADMIN("admin");

    Role(String name) {
        this.name = name;
    }
    public final String name;

    public String getName() {
        return name;
    }
}
