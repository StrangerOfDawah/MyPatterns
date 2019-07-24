package Patterns.Proxy;

public class LogInput implements Helloable{
    private Service inpService;

    public String sayHello(String name) {
        logInput(name);
        return inpService.sayHello(name);
    }

    public void logInput(String name){
        System.out.println(inpService.sayHello(name));
    }


    public LogInput(Helloable inpService) {
        this.inpService = (Service) inpService;
    }

}
