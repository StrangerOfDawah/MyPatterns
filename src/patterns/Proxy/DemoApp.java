package patterns.Proxy;

import patterns.Proxy.proxyComponents.LogInputService;
import patterns.Proxy.proxyComponents.LogOutputService;
import patterns.Proxy.exceptionCompoments.TooLongStringException;
import patterns.Proxy.serviceComponents.Service;

public class DemoApp {
    public static void main(String[] args) {

        Helloable hello = new LogInputService(new Service());
        hello.sayHello("Strangerfsdfsdfsdfsdfdsfsdf");

        Helloable hello3 = new LogOutputService(new Service());
        hello3.sayHello("Stranger");
    }
}
