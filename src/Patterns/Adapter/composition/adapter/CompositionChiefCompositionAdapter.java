package Patterns.Adapter.composition.adapter;

import Patterns.Adapter.composition.CompositionChief;
import Patterns.Adapter.composition.CompositionPlumber;

public class CompositionChiefCompositionAdapter implements CompositionChief {

    private CompositionPlumber compositionPlumber = new CompositionPlumber();

    public Object makeBreakfast() {
        return compositionPlumber.getKey();
    }

    public Object makeDinner() {
        return compositionPlumber.getScrewDriver();
    }

    public Object makeSupper() {
        return compositionPlumber.getPipe();
    }

}
