package sathya.in;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext context = new
				ClassPathXmlApplicationContext("spfwcon.xml");
		Employee obj = (Employee)context.getBean("empObj");
		System.out.println(obj.hashCode());
		Employee obj2 = (Employee)context.getBean("empObj");
		System.out.println(obj2.hashCode());
		Employee obj3 = (Employee)context.getBean("empObj");
		System.out.println(obj3.hashCode());

	}

}
