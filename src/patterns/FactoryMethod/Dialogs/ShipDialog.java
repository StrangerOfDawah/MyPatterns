package patterns.FactoryMethod.Dialogs;

import patterns.FactoryMethod.ConctreteTransports.ShipTransport;
import patterns.FactoryMethod.Transport;

public class ShipDialog extends Dialog {

    @Override
    public Transport createTransport() {
        return new ShipTransport();
    }
}
