package com.app.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		/*Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Reddy");
		emp.setEmpSal(5.0);*/
		
		/*Updating and deleting*/
		Employee emp = (Employee)session.get(Employee.class, 11);
		//emp.setEmpSal(5.5);
		Transaction tx = session.beginTransaction();
		
		//session.save(emp);
		//session.update(emp);
		session.delete(emp);
		tx.commit();
		session.clear();
	}

}
