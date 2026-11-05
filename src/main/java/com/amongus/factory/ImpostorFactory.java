package com.amongus.factory;

import com.amongus.model.Player;

public class ImpostorFactory extends PlayerFactory {
    @Override
    public Player createPlayer(String nickname, String color) {
        return new Impostor(nickname, color);
    }
}