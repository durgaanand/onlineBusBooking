package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.Bookingdto;
import com.cg.entities.Booking;
import com.cg.entities.FeedBack;
import com.cg.entities.Passenger;
import com.cg.entities.User;


/**************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service layer's IBookingService interface
 * Created date: 21-04-2021
 * 
 ****************************************************************************/


@Service
public interface IBookingService 
{
	public long addBooking(Booking booking); 
	
	public void deleteBooking(long bookingId); 

	boolean updateBookingDate(long bookingId, Booking booking);

	public Booking getBookingDetailsById(long bookingId);

	public Booking getAllBookingsByUsername(String username);
	
	public List<FeedBack> getFeedBackByBusRoute(String routeName);

	

}
