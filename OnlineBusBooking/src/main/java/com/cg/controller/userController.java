package com.cg.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.dto.UserDto;
import com.cg.entities.User;
import com.cg.exceptions.InvalidUsernameException;
import com.cg.service.userServiceImpl;

/******************************************************************
 * 
 * 
 * 
 * @author Anand
 * Description: This class is used for user controller where we can add, delete , update user
 * Version: v1.1
 * Created date: 20 April 2021
 * 
 * 
 *
 *******************************************************************/
@RestController
@RequestMapping("/user")

public class userController {
	@Autowired
	private userServiceImpl userservice;
	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param user
	 * @return ResponseEntity<Object>
	 * @PostMapping:  definition
	 * Created date: 20 April 2021
	 * 
	 */
	
	
	
	@PostMapping("/userapi")
	public ResponseEntity<Object> addUser(@RequestBody UserDto user)
	{
		userservice.addUser(user);
		return new ResponseEntity<>("Added User Successfully", HttpStatus.OK);
	}
	
	
	
    @DeleteMapping("/delete/{username}")
	public ResponseEntity<Object> deleteUser(@PathVariable String username) throws InvalidUsernameException{
		userservice.deleteUser(username);
		return new ResponseEntity<>("Deleted User Successfully", HttpStatus.OK);
	}
    
    
    
   @PutMapping("/updateP/{username}")
   public ResponseEntity<Object> updatePassword(@PathVariable String username,String newPassword) throws InvalidUsernameException{
	   userservice.updatePassword(username, newPassword);
	   return new ResponseEntity<>("password updated successfully", HttpStatus.OK);
   }

        
}
