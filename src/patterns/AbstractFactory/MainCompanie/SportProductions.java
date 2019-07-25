package patterns.AbstractFactory.MainCompanie;

import patterns.AbstractFactory.MainCompanie.Productions.Ball;
import patterns.AbstractFactory.MainCompanie.Productions.Uniform;

public interface SportProductions {

    Ball createBall();
    Uniform createUniform();
}
