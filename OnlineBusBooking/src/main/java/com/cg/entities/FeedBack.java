package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback1")
public class FeedBack {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rating;
	private String comment;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private String username;
	private String routeName;
	//private BusOperator busOperator;
	public FeedBack(int rating, String comment, String username, String routeName, BusOperator busOperator) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.username = username;
		this.routeName = routeName;
		this.busOperator = busOperator;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public BusOperator getBusOperator() {
		return busOperator;
	}
	public void setBusOperator(BusOperator busOperator) {
		this.busOperator = busOperator;
	} 
	
}
