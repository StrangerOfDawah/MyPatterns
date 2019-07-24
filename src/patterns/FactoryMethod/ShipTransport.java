package patterns.FactoryMethod;

public class ShipTransport implements Transport {

    @Override
    public void move() {
        System.out.println("I'am swimming!");
    }

    @Override
    public void getName() {
        System.out.println("I am a ship!");
    }
}
