package unicobib.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hi!!-- this ia a English Greeting";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hi!!-- This is a spanish greeting";
    }

    @Override
    public String getGermanGreeting() {
        return "Hi!!-- This is a german greeting";
    }
}
