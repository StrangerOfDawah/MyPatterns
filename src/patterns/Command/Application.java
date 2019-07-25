package patterns.Command;

import patterns.Command.actions.Action;
import patterns.Command.actions.CommandOff;
import patterns.Command.actions.CommandOn;
import patterns.Command.mainComponents.Light;

public class Application {
    public static void main(String[] args) {
        Light light = new Light();

        Action actOn = new CommandOn(light);
        Action actOff = new CommandOff(light);

        actOn.execute();
        actOff.execute();

    }
}
