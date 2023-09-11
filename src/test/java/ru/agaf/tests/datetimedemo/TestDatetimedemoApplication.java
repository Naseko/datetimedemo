package ru.agaf.tests.datetimedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDatetimedemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DatetimedemoApplication::main).with(TestDatetimedemoApplication.class).run(args);
	}

}
