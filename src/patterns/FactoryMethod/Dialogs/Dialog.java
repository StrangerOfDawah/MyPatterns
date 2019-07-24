package patterns.FactoryMethod.Dialogs;

import patterns.FactoryMethod.Transport;

public abstract class Dialog {

    public void runCreating() {

        Transport transport = createTransport();
        transport.getName();
        transport.move();
    }

    public abstract Transport createTransport();

}
