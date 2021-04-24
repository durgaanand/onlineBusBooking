package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDaoi;
import com.cg.dto.UserDto;
import com.cg.entities.User;
import com.cg.exceptions.InvalidUsernameException;

@Service
public class userServiceImpl implements IUsersService  {
	@Autowired
	UserDaoi userDao;
	

	
	

	@Override
	public void deleteUser(String username) 
	{
		// TODO Auto-generated method stub
		if(userDao.existsByUsername(username))
		{
			User user = new User();
			user=userDao.findByUsername(username);
			userDao.delete(user);
		}
			
		
		
		
	}

	@Override
	public void updatePassword(String username, String newPassword) 
	{
		// TODO Auto-generated method stub
		if(userDao.existsByUsername(username)) 
		{
			User user = new User();
			UserDto userdto = new UserDto();
			user=userDao.findByUsername(username);
			user.setPassword(userdto.getPassword());
			userDao.save(newPassword);
		}
		else
		{
			throw new InvalidUsernameException("not found");
		}
			
			
		
		
	}

	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param user
	 * @return User
	 * @PostMapping:  definition
	 * Created date: 20 April 2021
	 * 
	 */
	

	@Override
	public User addUser(UserDto userdto) 
	{
		// TODO Auto-generated method stub
		User user=new User();
		user.setUsername(userdto.getUsername());
		user.setPassword(userdto.getPassword());
		return userDao.save(user);
	
		
	}

}
