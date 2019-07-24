package Patterns.Decorator.decorators;

import Patterns.Decorator.Programming;

public class Driver implements Programming {
    Programming prog;

    public Driver(Programming acceptProg){
        prog = acceptProg;
    }

    public String create(){
        return "Driver is creating!";
    }
}
