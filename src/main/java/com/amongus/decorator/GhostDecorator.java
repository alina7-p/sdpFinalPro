package com.amongus.decorator;

import com.amongus.model.Player;

public class GhostDecorator extends PlayerDecorator {
    public GhostDecorator(Player player) {
        super(player);
    }

    @Override
    public void performRoleAction() {
        super.performRoleAction();
        System.out.println("[Ghost Ability] " + getNickname() + " can now pass through walls!");
    }
}