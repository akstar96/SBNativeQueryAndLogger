package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;

@Service
public class UserServices {
	@Autowired
	private UserDAO userdao;
  
	//Adding user in database
	public List<User> adduser(List<User> user) {
	List<User> user1= userdao.saveAll(user);
		System.out.println("user Services layer save user");
		System.out.println(user);
		return user1;
			
	}
	
	// Get all data from database
	public List<User> getalldata(User user){
		List<User> list=userdao.findAll();
		System.out.println("user services layer gat all data");
		System.out.println(list);
		return list;
		
	}
	
	//Finding data by ID
	public Optional<User> getdata(Long id){
		Optional<User> list1=userdao.findById(id);
		return list1;	
	}
	
	//find by last name NATIVE Query Testing
	public User findByLastname(String lastname) {
		User a=userdao.findByLastname(lastname);
		return a;
		
	}
	
	
	
	
}
