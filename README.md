# Ei-Assessment

# Exercise 1 – Java Design Patterns

This exercise showcases six design patterns, each implemented as an independent console application.

# Implemented Patterns

#Observer Pattern (Behavioral) – Stock Market Notifier

Observers (EmailNotifier, MobileNotifier) receive updates when stock prices change.

Run:

cd observer
javac *.java
java Main


#Strategy Pattern (Behavioral) – Payment Processor

Supports multiple payment methods (CreditCardPayment, UPIPayment, PayPalPayment).

Run:

cd strategy
javac *.java
java Main


#Singleton Pattern (Creational) – Logger

Ensures only one instance of AppLogger exists.

Run:

cd singleton
javac *.java
java Main


#Factory Pattern (Creational) – Shape Creator

ShapeFactory creates shapes (Circle, Square, Rectangle) without exposing creation details.

Run:

cd factory
javac *.java
java Main


#Adapter Pattern (Structural) – Legacy Printer Adapter

Adapts LegacyPrinter to work with the new AdvancedPrinter interface.

Run:

cd adapter
javac *.java
java Main


#Decorator Pattern (Structural) – Coffee Shop

Start with SimpleCoffee, add decorators (Milk, Sugar, Cream) dynamically.

Run:

cd decorator
javac *.java
java Main

# Features

Covers Behavioral, Creational, Structural patterns.

Each pattern runs independently (no linking).

Follows OOP & SOLID principles.

Includes validation & exception handling.

# Exercise 2 – Astronaut Daily Schedule Organizer

A console-based Java application that helps astronauts manage their daily schedules.
Implements Singleton, Factory, and Observer patterns.

# Features

Add new tasks (with description, time, and priority).

Remove existing tasks.

View tasks sorted by start time.

Validate overlapping tasks.

Edit tasks (optional).

Mark tasks as completed (optional).

Filter tasks by priority (LOW, MEDIUM, HIGH).

# Design Patterns Used

Singleton → ScheduleManager (single instance).

Factory → TaskFactory (creates tasks).

Observer → ConsoleNotifier (notifications for add/remove/conflict).

📂 Project Structure
src/com/scheduler/
├── Main.java
├── Task.java
├── Priority.java
├── TaskFactory.java
├── Observer.java
├── ConsoleNotifier.java
└── ScheduleManager.java

# How to Run
javac com/scheduler/*.java
java com.scheduler.Main

# Commands

add → Add a new task

view → View all tasks

remove → Remove a task by description

complete → Mark task as completed

edit → Edit a task

viewprio → View tasks by priority

exit → Exit program

# Notes

Time format: HH:mm (24-hour format).

Tasks cannot overlap.

Data is not persisted (in-memory only).
