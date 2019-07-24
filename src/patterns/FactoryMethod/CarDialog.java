package patterns.FactoryMethod;

public class CarDialog extends Dialog {

    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
