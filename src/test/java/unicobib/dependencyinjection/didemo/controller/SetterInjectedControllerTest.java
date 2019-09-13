package unicobib.dependencyinjection.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import unicobib.service.GreetingServiceImpl;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectedController.sayHello());
    }
}
