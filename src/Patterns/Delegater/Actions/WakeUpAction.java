package Patterns.Delegater.Actions;

import Patterns.Delegater.Actions.TimerAction;

public class WakeUpAction implements TimerAction {

    public void onTime() {
        System.out.println("Пора вставать!");
    }
 }

