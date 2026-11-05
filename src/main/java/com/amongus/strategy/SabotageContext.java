package com.amongus.strategy;

public class SabotageContext {
    private SabotageStrategy strategy;

    public void setStrategy(SabotageStrategy strategy) {
        this.strategy = strategy;
    }

    public void triggerSabotage() {
        if (strategy == null) {
            System.out.println("No sabotage strategy selected.");
            return;
        }
        System.out.println("Activating: " + strategy.getSabotageType());
        strategy.executeSabotage();
    }
}