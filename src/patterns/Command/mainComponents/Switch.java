package patterns.Command.mainComponents;

import patterns.Command.actions.CommandOff;
import patterns.Command.actions.CommandOn;

public class Switch {
    private CommandOn turnOn;
    private CommandOff turnOff;

    public Switch(CommandOn turnOn, CommandOff turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void setTurnOn(){
        turnOn.execute();
    }


    public void setTurnOff(){
        turnOff.execute();
    }
}
