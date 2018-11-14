package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class AppMailSender {

	@Autowired
	private JavaMailSender mailSender;

	public boolean sendEmail(String to, String sub, String text, FileSystemResource file) {
		boolean status = false;
		try {
			// 1. Create Message Object
			MimeMessage message = mailSender.createMimeMessage();
			// 2. Create helper class Object
			MimeMessageHelper helper = new MimeMessageHelper(message, file!=null?true:false);
			// 3. Compose Message
			helper.setTo(to);
			helper.setFrom("ashokvasari01@gamil.com");
			helper.setSubject(sub);
			helper.setText(text);
			helper.addAttachment(file.getFilename(), file);
			// 4. Send Email
			mailSender.send(message);
			status=true;
		}
		catch (Exception e) {
			status=false;
			e.printStackTrace();
			System.out.println(e);
		}
		return status;
	}}
