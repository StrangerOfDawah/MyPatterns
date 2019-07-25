package patterns.Command.actions;

import patterns.Command.mainComponents.Light;

public class CommandOn implements Action {
    private Light theLight;

    @Override
    public void execute() {
        theLight.turnOn();
    }

    public CommandOn(Light theLight) {
        this.theLight = theLight;
    }
}
