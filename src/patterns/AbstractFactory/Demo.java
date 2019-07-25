package patterns.AbstractFactory;

import patterns.AbstractFactory.Companies.BasketballProduction;
import patterns.AbstractFactory.Companies.SoccerProduction;
import patterns.AbstractFactory.MainCompanie.SportProductions;

import java.util.Scanner;

public class Demo {
    private static Application app;
    private static SportProductions output;

    public static void main(String[] args) {

        System.out.print("Please choice type of product (0 - Soccer) or  (1 - Basketball): ");
        int scan = new Scanner(System.in).nextInt();

        Application app = recognizeProduction(scan);
        app.create();
    }



    static Application recognizeProduction(Integer value) {
        if (value == 0){
            output = new SoccerProduction();
            app = new Application(output);
        }else if (value == 1){
            output = new BasketballProduction();
            app = new Application(output);
        }else {
            System.out.println("Didn't find!");
            System.exit(0);
        }
        return app;
    }

}
