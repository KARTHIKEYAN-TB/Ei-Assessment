package com.scheduler;

public class Task {
    String description;
    String start;
    String end;
    Priority priority;
    boolean completed = false;

    Task(String description, String start, String end, Priority priority) {
        this.description = description;
        this.start = start;
        this.end = end;
        this.priority = priority;
    }

    @Override
    public String toString() {
        String done = completed ? " (Completed)" : "";
        return start + " - " + end + ": " + description + done + " [" + priority + "]";
    }
}
