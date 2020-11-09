package com.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.MailAPI;
import com.model.User;
import com.services.UserServices;

@RestController
public class Homecontroller {
	@Autowired
	private UserServices userser;
	@Autowired
	private MailAPI mail;
	
	
	@PostMapping("/add")
	public List<User> addUser(@RequestBody List <User> user) {
	List<User> user1=	userser.adduser(user);
		System.out.println("in controller add");
		System.out.println(user1);
		return user1;	
	}

	@GetMapping("/getall")
	public List<User> Getalldata(User user) throws MessagingException{
		List<User> list=userser.getalldata(user);
		mail.Adminmailsender();
		System.out.println("in controller getall data");
		System.out.println(list);
		return list ;
		
	}
	
@GetMapping("/{lastname}")
public User findBylastname(@PathVariable String lastname) {
	User a=userser.findByLastname(lastname);
	return a;
	
}
	
	
}
