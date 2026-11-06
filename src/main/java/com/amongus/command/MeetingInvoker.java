package com.amongus.command;

import java.util.ArrayList;
import java.util.List;

public class MeetingInvoker {
    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        history.add(command);
        command.execute();
    }

    public void showHistory() {
        System.out.println("\n--- Voting/Action History ---");
        System.out.println("Total actions executed during meeting: " + history.size());
    }
}
