package com.amongus.model;

public abstract class Player {
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
}