package unicobib.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
