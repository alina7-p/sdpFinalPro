package com.amongus.command;

import com.amongus.model.Player;

public class VoteCommand implements Command {
    private Player voter;
    private Player target;

    public VoteCommand(Player voter, Player target) {
        this.voter = voter;
        this.target = target;
    }

    @Override
    public void execute() {
        System.out.println("[Command Action] Player " + voter.getNickname() + " voted for " + target.getNickname() + "!");
    }
}
