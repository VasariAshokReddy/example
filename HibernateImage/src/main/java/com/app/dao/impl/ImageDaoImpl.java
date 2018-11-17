package com.app.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.LobCreator;

import com.app.dao.ImageDao;
import com.app.model.Employee;
import com.app.util.HibernateUtil;
import com.mysql.jdbc.Blob;


public class ImageDaoImpl implements ImageDao {

	private SessionFactory factory;
	public ImageDaoImpl()
	{
		factory = HibernateUtil.getSessionFactory();
	}
	
	
	@SuppressWarnings("resource")
	public void insertImage() {
		 Session session = factory.openSession();
	        Employee e = new Employee();
	        e.setEmpId(2);
	        try
	        {
	        	FileInputStream fis = new FileInputStream("E:\\ashokreddy.jpg");
	        	int available =fis.available();
	        	byte bytes[] = new byte[available]; 
	        	fis.read();
	        	LobCreator creator = Hibernate.getLobCreator(session);
	        	Blob image= (Blob) creator.createBlob(bytes);
	        	e.setImage(image);
	        }
	        catch(Exception e1)
	        {
	        	
	        }
	        Transaction tx = session.beginTransaction();
	        session.save(e);
	        tx.commit();
	        session.close();
		}

	

	public void selectImage(int empId) {
		Session session = factory.openSession();
		Employee emp = (Employee)session.get(Employee.class, empId);
		Blob image = emp.getImage();
		try
		{
			int length = (int) image.length();
			byte[] bytes= image.getBytes(2, length);
			FileOutputStream fos = new FileOutputStream("E:\\ashokreddy.jpg");
			fos.write(bytes);
			fos.close();
			session.close();
			
		}
		catch(Exception ex)
		{
			
		}

	}


}
