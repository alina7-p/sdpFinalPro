package com.amongus.singleton;

import java.util.ArrayList;
import java.util.List;

public class GameSession {
    private static GameSession instance;
    private String currentPhase;
    private List<String> activeRooms;

    private GameSession() {
        this.currentPhase = "LOBBY";
        this.activeRooms = new ArrayList<>();
        activeRooms.add("Cafeteria");
        activeRooms.add("Electrical");
        activeRooms.add("MedBay");
        activeRooms.add("Navigation");
    }

    public static synchronized GameSession getInstance() {
        if (instance == null) {
            instance = new GameSession();
        }
        return instance;
    }

    public String getCurrentPhase() {
        return currentPhase;
    }

    public void setPhase(String phase) {
        this.currentPhase = phase;
        System.out.println("[GameSession] Game phase changed to: " + phase);
    }

    public List<String> getActiveRooms() {
        return activeRooms;
    }
}