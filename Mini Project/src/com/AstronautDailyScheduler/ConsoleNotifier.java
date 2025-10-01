package com.scheduler;

public class ConsoleNotifier implements Observer {
    public void notify(String message) {
        System.out.println("[NOTIFY] " + message);
    }
}

