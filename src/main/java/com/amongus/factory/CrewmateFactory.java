package com.amongus.factory;

import com.amongus.model.Player;

public class CrewmateFactory extends PlayerFactory {
    @Override
    public Player createPlayer(String nickname, String color) {
        return new Crewmate(nickname, color);
    }
}