package patterns.FactoryMethod;

public class ShipDialog extends Dialog {

    @Override
    public Transport createTransport() {
        return new ShipTransport();
    }
}
