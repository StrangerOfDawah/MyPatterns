package patterns.Adapter.inheritance;

import patterns.Adapter.inheritance.adapter.InheritanceChiefInheritanceAdapter;

public class SecondClient {

    public static void eat(Object dish)
    {  }

    public static void main(String[] args)
    {
        InheritanceChief ch = new InheritanceChiefInheritanceAdapter();
        Object dish = ch.makeBreakfast();
        eat(dish);
        dish = ch.makeLunch();
        eat(dish);
        dish = ch.makeDinner();
        eat(dish);

    }
}
