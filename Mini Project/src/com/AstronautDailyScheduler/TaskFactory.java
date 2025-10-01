package com.scheduler;

public class TaskFactory {
    public Task createTask(String description, String start, String end, String priority) {
        Priority p;
        switch(priority.toUpperCase()) {
            case "HIGH": p = Priority.HIGH; break;
            case "LOW": p = Priority.LOW; break;
            default: p = Priority.MEDIUM; break;
        }
        return new Task(description, start, end, p);
    }
}
