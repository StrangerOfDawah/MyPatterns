package patterns.AbstractFactory.Companies.Uniforms;

import patterns.AbstractFactory.MainCompanie.Productions.Uniform;

public class BasketballUniform implements Uniform {
    @Override
    public void wearUniform() {
        System.out.println("You created a Basketball uniform!");
    }
}
