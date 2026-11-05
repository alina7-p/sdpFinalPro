package com.amongus.factory;

import com.amongus.model.Player;

public abstract class PlayerFactory {
    public abstract Player createPlayer(String nickname, String color);
}
