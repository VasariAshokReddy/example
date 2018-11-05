package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context=new
				ClassPathXmlApplicationContext("spconff.xml");
		Address address=context.getBean("addrObj",Address.class);
		System.out.println(address);
		Employee
		employee=context.getBean("empObj",Employee.class);
		System.out.println(employee);
		System.out.println("done");
	
	}

}
