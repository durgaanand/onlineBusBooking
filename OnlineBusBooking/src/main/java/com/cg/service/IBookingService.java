package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.entities.Booking;
//import com.cg.entities.FeedBack;
import com.cg.entities.User;
import com.cg.exceptions.InvalidBookingIdException;
import com.cg.exceptions.InvalidBusRouteNameException;
import com.cg.exceptions.InvalidDateException;

public interface IBookingService {

	public long addBooking(Booking booking); // return booking id
	public boolean updateBookingDate(long bookingId)throws InvalidDateException;
	public boolean deleteBooking(long bookingId); 
	public Booking getBookingDetailsById(long bookingId)throws InvalidBookingIdException;
	public void addFeedBack(User user,long bookingId)throws InvalidBookingIdException;
	public List<Booking> getAllBookingsById(String username);
	public List<Booking> getAllBookingByDate(LocalDate date);
	public List<Booking> getAllBookingByBusRoute(String routeName)throws InvalidBusRouteNameException;
	public void addFeedback(String username,long bookingId,String msg);
	//public List<FeedBack> getFeedBackByBusRoute(String routeName)throws InvalidBusRouteNameException;;
	
}
