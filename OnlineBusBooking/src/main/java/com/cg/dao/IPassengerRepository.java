package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Passenger;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IPassengerRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IPassengerRepository extends JpaRepository<Passenger, Integer>
{
	

}
