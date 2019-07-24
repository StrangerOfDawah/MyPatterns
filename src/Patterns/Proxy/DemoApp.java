package Patterns.Proxy;

import Patterns.Proxy.proxyComponents.LogInput;
import Patterns.Proxy.proxyComponents.LogOutput;
import Patterns.Proxy.proxyComponents.TooLongStringException;
import Patterns.Proxy.serviceComponents.Service;

public class DemoApp {
    public static void main(String[] args) {

        Helloable hello = new LogInput(new Service());
        hello.sayHello("Stranger");

        Helloable hello2 = new TooLongStringException(new Service());
        hello2.sayHello("StrangerException");

        Helloable hello3 = new LogOutput(new Service());
        hello3.sayHello("Stranger");
    }
}
