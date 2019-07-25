package patterns.AbstractFactory.Companies;
import patterns.AbstractFactory.Companies.Balls.SoccerBall;
import patterns.AbstractFactory.Companies.Uniforms.BasketballUniform;
import patterns.AbstractFactory.MainCompanie.Productions.Ball;
import patterns.AbstractFactory.MainCompanie.Productions.Uniform;
import patterns.AbstractFactory.MainCompanie.SportProductions;

public class SoccerProduction implements SportProductions {

    @Override
    public Ball createBall() {
        return new SoccerBall();
    }

    @Override
    public Uniform createUniform() {
        return new BasketballUniform();
    }
}
