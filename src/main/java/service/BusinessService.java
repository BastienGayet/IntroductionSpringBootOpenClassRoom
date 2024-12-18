package service;

import model.HelloWorld;
import org.springframework.stereotype.Component;

@Component // This annotation indicates that the class is a Spring component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
