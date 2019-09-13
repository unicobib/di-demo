package unicobib.dependencyinjection.didemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import unicobib.service.GreetingService;

@Controller
public class HelloWorldController {

    private GreetingService greetingService;

    @Autowired
    public HelloWorldController(@Qualifier("constructorInjectedGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
    }

}
