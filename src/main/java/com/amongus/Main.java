package com.amongus;

import com.amongus.command.*;
import com.amongus.decorator.*;
import com.amongus.factory.*;
import com.amongus.model.Player;
import com.amongus.observer.EmergencyPublisher;
import com.amongus.singleton.GameSession;
import com.amongus.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AMONG US DESIGN PATTERNS DEMO ===\n");

        GameSession session = GameSession.getInstance();
        session.setPhase("TASKS_PHASE");

        PlayerFactory crewFactory = new CrewmateFactory();
        PlayerFactory impFactory = new ImpostorFactory();

        Player red = crewFactory.createPlayer("RedPlayer", "Red");
        Player black = impFactory.createPlayer("BlackPlayer", "Black");

        EmergencyPublisher alertSystem = new EmergencyPublisher();
        alertSystem.subscribe(red);
        alertSystem.subscribe(black);

        SabotageContext sabotage = new SabotageContext();
        sabotage.setStrategy(new LightsSabotage());
        sabotage.triggerSabotage();

        System.out.println("\n--- Player Effects ---");
        Player ghostRed = new GhostDecorator(red);
        ghostRed.performRoleAction();

        System.out.println("\n--- Emergency Meeting & Commands ---");
        alertSystem.notifyObservers("Body reported in Navigation!");

        MeetingInvoker invoker = new MeetingInvoker();
        invoker.executeCommand(new ReportBodyCommand(black));
        invoker.executeCommand(new VoteCommand(black, red));
        invoker.showHistory();
    }
}