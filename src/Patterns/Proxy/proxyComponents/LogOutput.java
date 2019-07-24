package Patterns.Proxy.proxyComponents;

import Patterns.Proxy.Helloable;
import Patterns.Proxy.serviceComponents.Service;

public class LogOutput implements Helloable {
    private Service outputService;

    public String sayHello(String name) {
        logOutput(name);
        return outputService.sayHello(name);
    }

    public void logOutput(String name){
        System.out.println(outputService.sayHello(name));
    }


    public LogOutput(Helloable inpService) {
        this.outputService = (Service) inpService;
    }
}
