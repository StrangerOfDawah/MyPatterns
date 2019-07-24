package patterns.Decorator.decorators;

import patterns.Decorator.Programming;

public class Driver implements Programming {
    Programming prog;

    public Driver(Programming acceptProg){
        prog = acceptProg;
    }

    public String create(){
        return "Driver is creating!";
    }
}
