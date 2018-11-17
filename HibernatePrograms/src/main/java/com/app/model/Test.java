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
		
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("AshokReddy");
		emp.setEmpSal(10.0);
		
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		tx.commit();
		session.clear();
	}

}
