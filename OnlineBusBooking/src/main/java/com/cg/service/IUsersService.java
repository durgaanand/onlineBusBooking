package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.UserDto;
import com.cg.entities.Booking;
import com.cg.entities.User;
@Service
public interface IUsersService {

	public User addUser(UserDto userdto);
	public void deleteUser(String username);
	public void updatePassword(String username,String newPassword);
	
	

	
}
