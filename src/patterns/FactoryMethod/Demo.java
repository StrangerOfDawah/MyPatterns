package patterns.FactoryMethod;

import java.util.Scanner;

public class Demo {
    private static Dialog commonTransport;

    public static void main(String[] args) {
        System.out.print("Please choice car (0) or ship (1): ");
        int scan = new Scanner(System.in).nextInt();
        recognizeTransport(scan);
        runBusinessLogic();


    }

    static void recognizeTransport(Integer value) {
        if (value == 0){
            commonTransport = new CarDialog();
        }else if (value == 1){
            commonTransport = new ShipDialog();
        }else {
            System.out.println("Didn't accept!");
            System.exit(0);
        }
    }

    static void runBusinessLogic(){
        commonTransport.runCreating();
    }
}
