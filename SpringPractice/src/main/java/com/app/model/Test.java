package com.app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("sconfig.xml");
		Employee e = (Employee)ctx.getBean("emp");
		System.out.println(e);
	}

}
