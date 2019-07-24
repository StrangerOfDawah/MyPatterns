package Patterns.Delegater;

import Patterns.Delegater.Actions.ChickenIsReadyAction;
import Patterns.Delegater.Actions.TimerAction;
import Patterns.Delegater.Actions.WakeUpAction;

import java.util.Scanner;

public class Timer {

    TimerAction action;

    void run() {
        if (isTime()) {
            action.onTime();
        }
    }

    private boolean isTime() {
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Введите тип действия:");
        Scanner scanner = new Scanner(System.in);
        String actionType = scanner.nextLine();
        Timer timer = new Timer();

        if (actionType.equalsIgnoreCase("set wake up timer")) {
            timer.action = new WakeUpAction();
        } else if (actionType.equalsIgnoreCase("set chicken timer")) {
            timer.action = new ChickenIsReadyAction();
        }

        timer.run();
    }

}
