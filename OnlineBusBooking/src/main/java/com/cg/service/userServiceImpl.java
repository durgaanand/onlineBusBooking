package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDaoi;
import com.cg.entities.User;

@Service
public class userServiceImpl implements IUsersService  {
	@Autowired
	UserDaoi userDao;

	@Override
	public void addUser(User user) {
		userDao.save(user);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassword(String username, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User singIn(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User singOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
