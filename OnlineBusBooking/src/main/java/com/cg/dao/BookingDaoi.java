package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Booking;
@Repository
public interface BookingDaoi extends JpaRepository<Booking,Integer >{

}
