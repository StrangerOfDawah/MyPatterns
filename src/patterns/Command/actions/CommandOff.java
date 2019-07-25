package patterns.Command.actions;

import patterns.Command.mainComponents.Light;

public class CommandOff implements Action {
    private Light theLight;

    @Override
    public void execute() {
        theLight.turnOff();
    }

    public CommandOff(Light theLight) {
        this.theLight = theLight;
    }
}
