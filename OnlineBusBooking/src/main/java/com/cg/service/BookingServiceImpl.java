package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.Bookingdto;
import com.cg.entities.Booking;
import com.cg.entities.FeedBack;
import com.cg.entities.Passenger;
import com.cg.entities.User;
import com.cg.exceptions.IdNotFoundException;
import com.cg.exceptions.InvalidBookingUsernameException;
import com.cg.exceptions.InvalidBusRouteNameException;
import com.cg.dao.IBookingRepository;
import com.cg.dao.IFeedBackRepository;
import com.cg.dao.IPassengerRepository;

import com.cg.dao.UserDaoi;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service implementation class of the function declared in the 
 * 				service interface IBookingService that autowires a bean of IBookingService
 * 				to perform JPA Functions
 * Created date: 21-04-2021
 * 
 ******************************************************************/


@Service
public class BookingServiceImpl implements IBookingService
{
	@Autowired
	IBookingRepository bookingRepository;
	
	@Autowired
	UserDaoi userRepository;
	
	@Autowired
	IFeedBackRepository feedbackRepository;
	
	
	/***********************************************************************************
	 * Method: addBooking
	 * @author Harshitha V
	 * @param Booking
	 * @return Long
	 * Description: Adds Booking object passed into the Oracle Database connected to it
	 * 
	 ***********************************************************************************/
	
	@Override
	public long addBooking(Booking booking) 
	{
		bookingRepository.save(booking);
		return booking.getBookingId();
	}

	
	/****************************************************************************
	 * Method: deleteBooking
	 * @author Harshitha V
	 * @param bookingId
	 * @return void
	 * @throws IdNotFoundexceptions
	 * Description: deletes Booking object in the Oracle Database connected to it
	 *****************************************************************************/
	
	@Override
	public void deleteBooking(long bookingId) 
	{
		if(bookingRepository.existsById(bookingId))
		{
			bookingRepository.deleteById(bookingId);
		}
		else 
		{
			throw new IdNotFoundException();
		}
	}
	
	
	/**************************************************************************************
	 * Method: updateBookingDate
	 * @author Harshitha V
	 * @param bookingId, booking
	 * @return boolean
	 * @throws IdNotFoundexceptions
	 * Description: Updates booking object passed into the Oracle Database connected to it
	 * 				and updates already existing object. 
	 *************************************************************************************/

	@Override
	public boolean updateBookingDate(long bookingId, Booking booking) 
	{
		Booking updatebooking = bookingRepository.findById(bookingId).get();
		
		updatebooking.setDestination(booking.getDestination());
		updatebooking.setBusNumber(booking.getBusNumber());

		if(updatebooking == null) 
		{
			throw new IdNotFoundException("Booking Id was not found");
		}
		else
		{
			bookingRepository.save(updatebooking);
		}
		return true;
	}
	
	
	/**************************************************************************************
	 * Method: getBookingDetailsById
	 * @param bookingId
	 * @return booking
	 * @throws IdNotFoundexceptions
	 * Description: allows client to view booking details of the id passed as the parameter 
	 **************************************************************************************/
	
	@Override
	public Booking getBookingDetailsById(long bookingId) 
	{
		if(bookingRepository.existsByBookingId(bookingId)) 
		{
			return bookingRepository.findAllByBookingId(bookingId);
		}
		else {
			 throw new IdNotFoundException();
		}
	}
	
	
	/**************************************************************************************
	 * Method: getAllBookingsByUsername
	 * @param username
	 * @return booking
	 * @throws InvalidBookingUsernameexceptions
	 * Description: allows client to view booking details of the username passed as the parameter 
	 **************************************************************************************/
	
	@Override
	public Booking getAllBookingsByUsername(String username){
		
		if(userRepository.existsByUsername(username)) {
			return bookingRepository.findAllByUsername(username);
		}
		else throw new InvalidBookingUsernameException();
		
	}
	
	
	/******************************************************************************************************
	 * Method: getFeedBackByBusRoute
	 * @param routeName
	 * @return booking
	 * @throws InvalidBusRouteNameexceptions
	 * Description: allows client to view feedback of a bus route by passing the routeName as the parameter 
	 ******************************************************************************************************/
	
	@Override
	public List<FeedBack> getFeedBackByBusRoute(String routeName){
		
		if(feedbackRepository.existsByRouteName(routeName)) {
			return bookingRepository.getFeedBackByBusRoute(routeName);
		}
		else {
			throw new InvalidBusRouteNameException();
		}
		
	}


	
	
	
}
