package patterns.FactoryMethod.ConctreteTransports;

import patterns.FactoryMethod.Transport;

public class CarTransport implements Transport {

    @Override
    public void move() {
        System.out.println("I'm driving!");
    }

    @Override
    public void getName() {
        System.out.println( "I am a car!");
    }
}
