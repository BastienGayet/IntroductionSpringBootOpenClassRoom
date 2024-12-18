package com.openclassroom.example.HelloWolrd;

import model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.BusinessService;

@SpringBootApplication
@ComponentScan("service") // Scan the service package
public class HelloWolrdApplication implements CommandLineRunner {


	@Autowired // Inject the BusinessService object
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(HelloWolrdApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		HelloWorld hw = bs.getHelloWorld(); // Create a new HelloWorld object
		System.out.println(hw);
	}
}
