package com.amongus.model;

public class Task {
    private String name;
    private String location;
    private boolean isCompleted;

    public Task(String name, String location) {
        this.name = name;
        this.location = location;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void complete() {
        this.isCompleted = true;
    }
}