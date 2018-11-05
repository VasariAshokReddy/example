package com.sathyatech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spcon.xml");
		Student st = (Student)ctx.getBean("obj");
		System.out.println(st);
	}

}
