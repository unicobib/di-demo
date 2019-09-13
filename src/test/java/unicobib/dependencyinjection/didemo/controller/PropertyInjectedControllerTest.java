package unicobib.dependencyinjection.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import unicobib.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU,propertyInjectedController.sayHello());
    }
}
