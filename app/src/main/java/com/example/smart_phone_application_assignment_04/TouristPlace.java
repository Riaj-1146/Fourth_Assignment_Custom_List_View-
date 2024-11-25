package com.example.smart_phone_application_assignment_04;

public class TouristPlace {
    String name;
    String description;
    int imageResId;

    public TouristPlace(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}