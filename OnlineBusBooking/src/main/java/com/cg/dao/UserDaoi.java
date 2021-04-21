package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.User;
@Repository
public interface UserDaoi extends JpaRepository<User,Integer>  {

}
