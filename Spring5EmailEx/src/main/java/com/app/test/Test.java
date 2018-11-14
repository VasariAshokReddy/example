package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.app.config.AppConfig;
import com.app.util.AppMailSender;

public class Test {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ApplicationContext ac = new ClassPathXmlApplicationContext(AppConfig.class);
		ApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
		AppMailSender mail = act.getBean("appMailSender", AppMailSender.class);
		FileSystemResource file = new FileSystemResource("E:\\ashok\\abc.txt");
		boolean flag = mail.sendEmail("ashokvasari786@gmail.com", "Hello", "Welcome To Spring Email", file);
		if(flag) {
		System.out.println("Done!!!");
		}else {
		System.out.println("Sorry!!!!");
		}
		}
}
