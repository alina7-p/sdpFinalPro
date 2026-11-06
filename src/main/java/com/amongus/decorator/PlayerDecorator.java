package com.amongus.decorator;

import com.amongus.model.Player;

public abstract class PlayerDecorator extends Player {
    protected Player decoratedPlayer;

    public PlayerDecorator(Player player) {
        super(player.getNickname(), player.getColor());
        this.decoratedPlayer = player;
    }

    @Override
    public String getRole() {
        return decoratedPlayer.getRole();
    }

    @Override
    public void performRoleAction() {
        decoratedPlayer.performRoleAction();
    }
}