package com.scheduler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskFactory factory = new TaskFactory();
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConsoleNotifier());

        while (true) {
            System.out.println("\nCommands: add, view, remove, complete, edit, viewprio, exit");
            System.out.print("Enter command: ");
            String cmd = sc.nextLine();

            if (cmd.equalsIgnoreCase("add")) {
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Start Time (HH:mm): ");
                String start = sc.nextLine();
                System.out.print("End Time (HH:mm): ");
                String end = sc.nextLine();
                System.out.print("Priority (LOW/MEDIUM/HIGH): ");
                String priority = sc.nextLine();

                Task task = factory.createTask(desc, start, end, priority);
                manager.addTask(task);

            } else if (cmd.equalsIgnoreCase("view")) {
                manager.viewTasks();

            } else if (cmd.equalsIgnoreCase("remove")) {
                System.out.print("Task Description: ");
                String desc = sc.nextLine();
                manager.removeTask(desc);

            } else if (cmd.equalsIgnoreCase("complete")) {
                System.out.print("Task Description: ");
                String desc = sc.nextLine();
                manager.markCompleted(desc);

            } else if (cmd.equalsIgnoreCase("edit")) {
                System.out.print("Task to edit: ");
                String oldDesc = sc.nextLine();
                System.out.print("New Description (or leave empty): ");
                String newDesc = sc.nextLine();
                System.out.print("New Start Time (or leave empty): ");
                String newStart = sc.nextLine();
                System.out.print("New End Time (or leave empty): ");
                String newEnd = sc.nextLine();
                System.out.print("New Priority (or leave empty): ");
                String newPriority = sc.nextLine();

                manager.editTask(oldDesc, newDesc, newStart, newEnd, newPriority);

            } else if (cmd.equalsIgnoreCase("viewprio")) {
                System.out.print("Enter Priority (LOW/MEDIUM/HIGH): ");
                String pr = sc.nextLine();
                manager.viewByPriority(Priority.valueOf(pr.toUpperCase()));

            } else if (cmd.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}

