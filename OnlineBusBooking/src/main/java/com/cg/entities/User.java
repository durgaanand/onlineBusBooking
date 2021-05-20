package com.cg.entities;
/******************************************************************
 * 
 * 
 * 
 * @author Anand
 * Description: This class is used for creating  data fields, getter and setter methods for respective fields 
 * Version: v1.1
 * Created date: 18 April 2021
 * 
 * 
 *
 *******************************************************************/

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Table(name="user4")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column(unique = true)
	private String username;
	private String password;
	//private Map<Booking, FeedBack> bookingFeedbackInfo;
	@OneToMany(mappedBy="userInfo",cascade = CascadeType.ALL)

	private List<Booking> booking;
	
	public User() {
		super();
	}

	public User(int userId, String username, String password, List<Booking> booking) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.booking = booking;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	
	
}
