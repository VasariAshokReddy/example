package com.app.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.app.config.AppConfig;

public class SendMessageTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		JmsTemplate jt=c.getBean(JmsTemplate.class);


		jt.send("my-test-spring", new MessageCreator() {
			@Override
			public Message createMessage(Session ses) throws JMSException {
				return ses.createTextMessage("SAMPLE ONE");
			}
		});
		c.close();
	}
}
