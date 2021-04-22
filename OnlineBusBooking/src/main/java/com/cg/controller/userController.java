package com.cg.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.User;
import com.cg.service.userServiceImpl;

@RestController

public class userController {
	@Autowired
	private userServiceImpl userservice;
	@RequestMapping(method=RequestMethod.POST,value="/userapi")
	public void addUser(@RequestBody User user)
	{
		userservice.addUser(user);
		
	}
     
		
	
		 
	
	
	

}
