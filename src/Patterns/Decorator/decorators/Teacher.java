package Patterns.Decorator.decorators;

import Patterns.Decorator.Programming;

public class Teacher implements Programming {
    Programming prog;

    public Teacher(Programming acceptProg){
        prog = acceptProg;
    }
    public String create(){
        return "Teacher is creating!";
    }
}
