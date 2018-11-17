package org.sathya;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bcd.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp);
		ctx.registerShutdownHook();
	}

}
