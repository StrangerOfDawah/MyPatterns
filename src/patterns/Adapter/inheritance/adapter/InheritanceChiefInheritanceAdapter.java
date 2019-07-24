package patterns.Adapter.inheritance.adapter;

import patterns.Adapter.inheritance.InheritanceChief;
import patterns.Adapter.inheritance.InheritancePlumber;

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
