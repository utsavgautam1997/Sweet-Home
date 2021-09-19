package com.upgrad.Hotel.Room.Booking.App;

import com.upgrad.Hotel.Room.Booking.App.Entity.Booking;
import com.upgrad.Hotel.Room.Booking.App.dao.Bookingdao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class BookingRoom {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(BookingRoom.class, args);

         Bookingdao bookingdao = context.getBean(
         		Bookingdao.class
		 );
		System.out.println(bookingdao);
//		Bookingdao bookingdao = context.getBean(Bookingdao.class);
//
//		Booking booking = new Booking();
//		booking.setBookedOn(LocalDateTime.of(2021, 10, 17,0,0));
//		booking.setFromDate(LocalDateTime.of(2021,10,19,0,0));
//		booking.setAadharNumber("71087775557");
//		booking.setNoOfRoom(10);
//		booking.setRoomNumber("1");
//		booking.setRoomPrice(1000);
//		booking.setToDate(LocalDateTime.of(2021,10,15,0,0));
//
//		System.out.println("before saving" + booking);
//		Booking saveBooking = Bookingdao.save(booking);
	}
}