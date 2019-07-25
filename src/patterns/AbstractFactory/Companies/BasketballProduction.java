package patterns.AbstractFactory.Companies;
import patterns.AbstractFactory.Companies.Balls.BasketballBall;
import patterns.AbstractFactory.Companies.Uniforms.BasketballUniform;
import patterns.AbstractFactory.MainCompanie.Productions.Ball;
import patterns.AbstractFactory.MainCompanie.Productions.Uniform;
import patterns.AbstractFactory.MainCompanie.SportProductions;

public class BasketballProduction implements SportProductions {

    @Override
    public Ball createBall() {
        return new BasketballBall();
    }

    @Override
    public Uniform createUniform() {
        return new BasketballUniform();
    }
}

