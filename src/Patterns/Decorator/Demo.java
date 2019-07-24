package Patterns.Decorator;


import Patterns.Decorator.components.Programmer;
import Patterns.Decorator.decorators.Driver;
import Patterns.Decorator.decorators.Engineer;
import Patterns.Decorator.decorators.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Programming> list = new ArrayList<>();
        list.add(new Driver(new Programmer()));
        list.add(new Engineer(new Programmer()));
        list.add(new Teacher(new Programmer()));
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i).create());
        }
    }
}
