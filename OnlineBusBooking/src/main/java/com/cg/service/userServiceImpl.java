package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDaoi;
import com.cg.dto.UserDto;
import com.cg.entities.User;
import com.cg.exceptions.UsernameAlreadyExistsException;
import com.cg.exceptions.UsernameNotFoundException;

@Service
public class userServiceImpl implements IUsersService  {
	@Autowired
	UserDaoi userDao;
	

	
	
    
	/*************
	 * Method : deleteUser
	 * Description: method used for deleting existing  user
	 * 
	 * @param username
	 * @return void
	 * Created date: 20 April 2021
	 * 
	 */
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
		else
		{
			throw new UsernameNotFoundException();
		}
				
	}
	
	 /*************
	 * Method : updatePassword
	 * Description: method used updating password of an existing user
	 * 
	 * @param username, newPassword
	 * @return void
	 * Created date: 20 April 2021
	 * 
	 */
	@Override
	public void updatePassword(String username, String newPassword) 
	{
		// TODO Auto-generated method stub
		if(userDao.existsByUsername(username)) 
		{
			User user = new User();
			user=userDao.findByUsername(username);
			user.setPassword(newPassword);
			userDao.save(user);
		}
		else
		{
			throw new UsernameNotFoundException();
		}
			
			
		
		
	}

	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param userdto
	 * @return User
	 * Created date: 20 April 2021
	 * 
	 */
	

	@Override
	public User addUser(UserDto userdto) 
	{
		// TODO Auto-generated method stub
		User user=new User();
		if(userDao.existsByUsername(userdto.getUsername())) 
		{
			throw new UsernameAlreadyExistsException();
			
		}
		else
		{
		user.setUsername(userdto.getUsername());
		
		user.setPassword(userdto.getPassword());
		return userDao.save(user);
		}
	
		
	}

}
