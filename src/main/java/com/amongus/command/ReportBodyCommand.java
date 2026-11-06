package com.amongus.command;

import com.amongus.model.Player;

public class ReportBodyCommand implements Command {
    private Player reporter;

    public ReportBodyCommand(Player reporter) {
        this.reporter = reporter;
    }

    @Override
    public void execute() {
        System.out.println("[Command Action] Player " + reporter.getNickname() + " reported a dead body!");
    }
}
