package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.FeedBack;


/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IFeedbackRepository interface  
 * Created date: 23-04-2021
 * 
 ******************************************************************/

@Repository
public interface IFeedBackRepository extends JpaRepository<FeedBack, Integer>
{

	boolean existsByRouteName(String routeName);
	

}
