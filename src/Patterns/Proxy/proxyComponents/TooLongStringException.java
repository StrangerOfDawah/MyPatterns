package Patterns.Proxy.proxyComponents;

import Patterns.Proxy.Helloable;
import Patterns.Proxy.serviceComponents.Service;

public class TooLongStringException extends Exception implements Helloable {
    private Service service;

    public TooLongStringException(Service service) {
        this.service = service;
    }

    public String sayHello(String name) {
        try {
            nameChecker(name);
        } catch (TooLongStringException e) {
            e.printStackTrace();
        }
        return service.sayHello(name);

    }

    public void nameChecker(String name) throws TooLongStringException {
        if (name.length()>10) {
            throw new TooLongStringException(service);
        }
    }
}
