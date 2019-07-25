package patterns.AbstractFactory;
import patterns.AbstractFactory.MainCompanie.Productions.Ball;
import patterns.AbstractFactory.MainCompanie.Productions.Uniform;
import patterns.AbstractFactory.MainCompanie.SportProductions;

public class Application {
    private Ball ball;
    private Uniform uniform;

    public Application(SportProductions production){
        this.ball = production.createBall();
        this.uniform = production.createUniform();
    }

    public void create(){
        ball.createBall();
        uniform.wearUniform();
    }

}
