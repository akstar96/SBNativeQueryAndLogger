package com.common;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
@Configuration
public class MailAPI {
	@Autowired
	private JavaMailSender javamail;
	
	
	public String Adminmailsender() throws MessagingException {
		MimeMessage message=javamail.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		helper.setTo("akashactive99@gmail.com");
		helper.setText("mail sending successfully");
		helper.setSubject("mail messageing testing");
		
	javamail.send(message);
		
		return "Mail sending sucessfully";
		
		
		
		
	}
	

}
