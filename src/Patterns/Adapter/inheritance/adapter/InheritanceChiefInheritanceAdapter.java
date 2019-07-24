package Patterns.Adapter.inheritance.adapter;

import Patterns.Adapter.inheritance.InheritanceChief;
import Patterns.Adapter.inheritance.InheritancePlumber;

public class InheritanceChiefInheritanceAdapter extends InheritancePlumber implements InheritanceChief {

    public Object makeBreakfast()
    {
        return getGasket();
    }
    public Object makeLunch()
    {
        return getPipe();
    }
    public Object makeDinner()
    {
        return getScrewNut();
    }

}
