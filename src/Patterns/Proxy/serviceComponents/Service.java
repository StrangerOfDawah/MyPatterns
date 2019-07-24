package Patterns.Proxy.serviceComponents;

import Patterns.Proxy.Helloable;

public class Service implements Helloable {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
