package unicobib.dependencyinjection.didemo.controller;

import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;
import unicobib.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU,constructorInjectedController.sayHello());
    }
}
