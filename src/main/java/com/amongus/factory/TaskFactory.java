package com.amongus.factory;

import com.amongus.model.Task;

public class TaskFactory {
    public static Task createRandomTask() {
        String[] taskNames = {"Swipe Card", "Fix Wiring", "Clean Vent", "Calibrate Distributor"};
        String[] locations = {"Admin", "Electrical", "Cafeteria", "Navigation"};

        int randomIndex = (int) (Math.random() * taskNames.length);
        return new Task(taskNames[randomIndex], locations[randomIndex]);
    }
}
