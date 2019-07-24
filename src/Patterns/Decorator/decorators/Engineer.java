package Patterns.Decorator.decorators;

import Patterns.Decorator.Programming;

public class Engineer implements Programming {
    Programming prog;

    public Engineer(Programming acceptProg){
        prog = acceptProg;
    }

    public String create(){
        return "Engineer is creating!";
    }
}
