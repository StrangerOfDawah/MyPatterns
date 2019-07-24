package patterns.FactoryMethod;

public abstract class Dialog {

    public void runCreating() {

        Transport transport = createTransport();
        transport.getName();
        transport.move();
    }

    public abstract Transport createTransport();

}
