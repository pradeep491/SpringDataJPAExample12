package com.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.test.spring");
		appContext.refresh();
		System.out.println("spring data jpa example...!");
		System.out.println("changes");
		System.out.println("changes1");
		System.out.println("changes3");
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();

		appContext.close();
	}
}
