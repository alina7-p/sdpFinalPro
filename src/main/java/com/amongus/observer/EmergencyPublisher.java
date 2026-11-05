package com.amongus.observer;

import java.util.ArrayList;
import java.util.List;

public class EmergencyPublisher {
    private List<GameObserver> observers = new ArrayList<>();

    public void subscribe(GameObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(GameObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String reason) {
        System.out.println("\n[EMERGENCY ALERT] " + reason);
        for (GameObserver observer : observers) {
            observer.onEmergencyMeeting(reason);
        }
    }
}