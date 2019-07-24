package patterns.Adapter.composition;

import patterns.Adapter.composition.adapter.CompositionChiefCompositionAdapter;

public class FirstClient {

    public static void main(String[] args) {

        CompositionChief compositionChief = new CompositionChiefCompositionAdapter();

        Object key = compositionChief.makeDinner();

    }
}
