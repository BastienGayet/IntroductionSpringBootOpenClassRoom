package com.openclassroom.example.HelloWolrd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import service.BusinessService;

@SpringBootTest
class HelloWolrdApplicationTests {


	@Autowired
	private BusinessService bs;


	@Test
	void contextLoads() {
	}


	@Test
	public void TestGetHelloWorld() {

		String expected = "Hello, World!";

		String result = bs.getHelloWorld().getValue();

		assert(expected.equals(result));
	}
}
