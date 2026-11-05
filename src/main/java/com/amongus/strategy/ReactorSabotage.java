package com.amongus.strategy;

public class ReactorSabotage implements SabotageStrategy {
    @Override
    public void executeSabotage() {
        System.out.println("[Sabotage] Reactor Meltdown initiated! Crewmates must fix it in 30 seconds.");
    }

    @Override
    public String getSabotageType() {
        return "Reactor Meltdown";
    }
}