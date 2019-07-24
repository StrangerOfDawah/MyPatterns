package patterns.Delegater.Actions;

public class WakeUpAction implements TimerAction {

    public void onTime() {
        System.out.println("Пора вставать!");
    }
 }

