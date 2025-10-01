package com.scheduler;

import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyAllObservers(String msg) {
        for (Observer o : observers) {
            o.notify(msg);
        }
    }

    // ✅ Add task with overlap validation
    public void addTask(Task task) {
        for (Task t : tasks) {
            if (overlaps(t, task)) {
                notifyAllObservers("Conflict: " + task.description + " overlaps with " + t.description);
                return;
            }
        }
        tasks.add(task);
        notifyAllObservers("Task added: " + task.description);
    }

    // ✅ Remove task
    public void removeTask(String description) {
        for (Task t : tasks) {
            if (t.description.equalsIgnoreCase(description)) {
                tasks.remove(t);
                notifyAllObservers("Task removed: " + description);
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    // ✅ View tasks sorted
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled.");
            return;
        }
        tasks.sort(Comparator.comparing(t -> t.start));
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    // ✅ Mark completed
    public void markCompleted(String description) {
        for (Task t : tasks) {
            if (t.description.equalsIgnoreCase(description)) {
                t.completed = true;
                notifyAllObservers("Task marked completed: " + description);
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    // ✅ View by priority
    public void viewByPriority(Priority p) {
        boolean found = false;
        for (Task t : tasks) {
            if (t.priority == p) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks with priority " + p);
        }
    }

    // ✅ Edit task
    public void editTask(String oldDesc, String newDesc, String newStart, String newEnd, String newPriority) {
        for (Task t : tasks) {
            if (t.description.equalsIgnoreCase(oldDesc)) {
                if (newDesc != null && !newDesc.isEmpty()) t.description = newDesc;
                if (newStart != null && !newStart.isEmpty()) t.start = newStart;
                if (newEnd != null && !newEnd.isEmpty()) t.end = newEnd;
                if (newPriority != null && !newPriority.isEmpty())
                    t.priority = Priority.valueOf(newPriority.toUpperCase());

                notifyAllObservers("Task updated: " + t.description);
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    // ✅ Simple overlap check
    private boolean overlaps(Task a, Task b) {
        int aStart = toMinutes(a.start);
        int aEnd = toMinutes(a.end);
        int bStart = toMinutes(b.start);
        int bEnd = toMinutes(b.end);

        return aStart < bEnd && aEnd > bStart;
    }

    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

