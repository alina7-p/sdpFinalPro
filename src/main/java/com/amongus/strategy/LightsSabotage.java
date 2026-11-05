package com.amongus.strategy;

public class LightsSabotage implements SabotageStrategy {
    @Override
    public void executeSabotage() {
        System.out.println("[Sabotage] Lights are turned OFF! Crewmates vision is reduced.");
    }

    @Override
    public String getSabotageType() {
        return "Lights Sabotage";
    }
}