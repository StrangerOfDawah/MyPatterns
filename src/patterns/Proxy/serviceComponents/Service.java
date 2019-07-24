package patterns.Proxy.serviceComponents;

import patterns.Proxy.Helloable;

public class Service implements Helloable {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
