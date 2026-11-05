package com.amongus.factory;

import com.amongus.model.Player;

public class Crewmate extends Player {
    public Crewmate(String nickname, String color) {
        super(nickname, color);
    }

    @Override
    public String getRole() {
        return "Crewmate";
    }

    @Override
    public void performRoleAction() {
        System.out.println("Crewmate " + getNickname() + " (" + getColor() + ") is completing a task!");
    }
}