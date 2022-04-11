package com.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.test.spring");
		appContext.refresh();
		System.out.println("spring data jpa example...!");
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();

		appContext.close();
	}
}
