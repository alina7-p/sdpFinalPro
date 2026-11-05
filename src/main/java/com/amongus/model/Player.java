package com.amongus.model;

import com.amongus.observer.GameObserver;

public abstract class Player implements GameObserver {
    private String nickname;
    private String color;

    public Player(String nickname, String color) {
        this.nickname = nickname;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public abstract String getRole();
    public abstract void performRoleAction();

    @Override
    public void onEmergencyMeeting(String reason) {
        System.out.println("Player " + nickname + " (" + color + ") received alert: " + reason + " -> Teleporting to Cafeteria table!");
    }
}