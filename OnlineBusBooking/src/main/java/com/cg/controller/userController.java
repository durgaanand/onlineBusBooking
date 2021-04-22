package com.cg.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.dto.UserDto;
import com.cg.entities.User;
import com.cg.service.userServiceImpl;

@RestController
@RequestMapping("/user")
public class userController {
	@Autowired
	private userServiceImpl userservice;
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<Object> deleteUser(@PathVariable String username){
		userservice.deleteUser(username);
		return new ResponseEntity<>("Deleted User Successfully", HttpStatus.OK);
	}

        
	
	@PostMapping("/userapi")
	public ResponseEntity<Object> addUser(@RequestBody UserDto user)
	{
		userservice.addUser(user);
		return new ResponseEntity<>("Added User Successfully", HttpStatus.OK);
	}

   
	
     
		
	
		 
	
	
	

}
