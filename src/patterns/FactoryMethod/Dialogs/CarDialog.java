package patterns.FactoryMethod.Dialogs;

import patterns.FactoryMethod.ConctreteTransports.CarTransport;
import patterns.FactoryMethod.Transport;

public class CarDialog extends Dialog {

    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
