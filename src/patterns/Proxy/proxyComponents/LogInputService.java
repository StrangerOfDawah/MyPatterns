package patterns.Proxy.proxyComponents;

import patterns.Proxy.Helloable;
import patterns.Proxy.exceptionCompoments.TooLongStringException;
import patterns.Proxy.serviceComponents.Service;

public class LogInputService implements Helloable {
    private Service inpService;

    public String sayHello(String name) {

        try {
            logInput(name);
        } catch (TooLongStringException e) {
            e.printStackTrace();
        }

        return inpService.sayHello(name);
    }

    public void logInput(String name) throws TooLongStringException{
        if (name.length()>10){
            throw new TooLongStringException();
        }
        else System.out.println(inpService.sayHello(name));
    }


    public LogInputService(Helloable inpService) {
        this.inpService = (Service) inpService;
    }

}
