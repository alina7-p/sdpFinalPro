package com.amongus.factory;

import com.amongus.model.Player;

public class Impostor extends Player {
    public Impostor(String nickname, String color) {
        super(nickname, color);
    }

    @Override
    public String getRole() {
        return "Impostor";
    }

    @Override
    public void performRoleAction() {
        System.out.println("Impostor " + getNickname() + " (" + getColor() + ") is sabotaging the system!");
    }
}