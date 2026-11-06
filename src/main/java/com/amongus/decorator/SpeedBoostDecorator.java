package com.amongus.decorator;

import com.amongus.model.Player;

public class SpeedBoostDecorator extends PlayerDecorator {
    public SpeedBoostDecorator(Player player) {
        super(player);
    }

    @Override
    public void performRoleAction() {
        super.performRoleAction();
        System.out.println("[Speed Boost] " + getNickname() + " is moving 2x faster!");
    }
}
