package com.upgrad.Hotel.Room.Booking.App.dao;

import com.upgrad.Hotel.Room.Booking.App.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookingdao extends JpaRepository<Booking,Integer> {


//    public  Booking save(Booking booking) ;
//
//
//    public  Booking findbyId(int id);
//    public Booking update(Booking booking);
//    public  void delete(Booking booking);

}
