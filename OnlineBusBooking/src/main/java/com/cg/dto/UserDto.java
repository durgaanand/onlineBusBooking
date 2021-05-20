package com.cg.dto;
/******************************************************************
 * 
 * 
 * 
 * @author Anand
 * Description: This class is used for creating data transfer object fields 
 * Created date: 19 April 2021
 *  Version: v1.1
 * 
 *
 *******************************************************************/

import javax.validation.constraints.NotEmpty;

public class UserDto 
{
	@NotEmpty(message="Username cannot be blank")
	private String username;
	@NotEmpty(message="password cannot be blank")
	private String password;
	public UserDto() 
	{
		super();
	}
	public UserDto(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}