package Patterns.Proxy;

public class Service implements Helloable {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
