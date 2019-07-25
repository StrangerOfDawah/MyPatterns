package patterns.AbstractFactory.Companies.Balls;

import patterns.AbstractFactory.MainCompanie.Productions.Ball;

public class SoccerBall implements Ball {
    @Override
    public void createBall() {
        System.out.println("You created a Soccer ball!");
    }
}
