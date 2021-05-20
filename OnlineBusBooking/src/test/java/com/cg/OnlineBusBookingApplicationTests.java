package com.cg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dto.UserDto;
import com.cg.exceptions.InvalidUsernameException;
import com.cg.exceptions.UsernameNotFoundException;
import com.cg.service.IUsersService;

@SpringBootTest
class OnlineBusBookingApplicationTests {
    @Autowired 
    IUsersService userService;
    
	@Test
	void addUserTest() 
	{
		UserDto userdto = new UserDto("rajan", "meghana");
		assertEquals("rajan", userService.addUser(userdto).getUsername());
		
		
	}
	
	
	@Test
	void updatePasswordTest()
	{
		assertThrows(UsernameNotFoundException.class, ()->userService.updatePassword("dhanum","789"));
		
		
	}
	

}
