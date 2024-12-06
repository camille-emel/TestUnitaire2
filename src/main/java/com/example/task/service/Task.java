package com.example.task.service;

public class Task {
    final int id;
    final String description;
    boolean state = false;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

}
