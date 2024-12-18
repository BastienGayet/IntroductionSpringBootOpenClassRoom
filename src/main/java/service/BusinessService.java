package service;

import model.HelloWorld;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component // This annotation indicates that the class is a Spring component
public class BusinessService {

    public HelloWorld getHelloWorld() {

        HelloWorld hw = new HelloWorld();

        return hw;
    }
}
