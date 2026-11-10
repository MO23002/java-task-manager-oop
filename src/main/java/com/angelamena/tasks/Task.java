package com.angelamena.tasks;

public class Task {
    private final int id;
    private final String description;
    private boolean completed;

    public Task(int id, String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        this.id = id;
        this.description = description.trim();
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return completed; }
    public void complete() { completed = true; }
}
