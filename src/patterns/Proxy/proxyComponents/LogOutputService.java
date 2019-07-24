package patterns.Proxy.proxyComponents;

import patterns.Proxy.Helloable;
import patterns.Proxy.serviceComponents.Service;

public class LogOutputService implements Helloable {
    private Service outputService;

    public String sayHello(String name) {
        return outputService.sayHello(logOutput(name));
    }

    public String logOutput(String name){
        System.out.println(outputService.sayHello(name));
        return name;
    }


    public LogOutputService(Helloable inpService) {
        this.outputService = (Service) inpService;
    }
}
