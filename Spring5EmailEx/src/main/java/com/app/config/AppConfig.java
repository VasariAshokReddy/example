package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages ="com.app")
public class AppConfig {

	@Bean
	public JavaMailSenderImpl mail() {
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		mail.setHost("smtp.gmail.com");
		mail.setPort(587);
		mail.setUsername("ashokvasari01@gmail.com");//enter your
	
		mail.setPassword("ashokreddy");//enter ur password.
		mail.setJavaMailProperties(props());
		return mail;
	}
	private Properties props() {
		Properties p = new Properties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		return p;
	}

}
