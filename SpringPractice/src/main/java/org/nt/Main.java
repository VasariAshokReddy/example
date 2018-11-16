package org.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp);
	}

}
