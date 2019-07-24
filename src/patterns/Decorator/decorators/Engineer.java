package patterns.Decorator.decorators;

import patterns.Decorator.Programming;

public class Engineer implements Programming {
    Programming prog;

    public Engineer(Programming acceptProg){
        prog = acceptProg;
    }

    public String create(){
        return "Engineer is creating!";
    }
}
