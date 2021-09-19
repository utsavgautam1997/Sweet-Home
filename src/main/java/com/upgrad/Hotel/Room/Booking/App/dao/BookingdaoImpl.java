package com.upgrad.Hotel.Room.Booking.App.dao;

import com.upgrad.Hotel.Room.Booking.App.Entity.Booking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class BookingdaoImpl implements Bookingdao {

    private SessionFactory sessionFactory;
    @Autowired
    public BookingdaoImpl(EntityManagerFactory entityManagerFactory){
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }



    @Override
    public Booking save(Booking booking) {
        Session session = this.sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(booking);
        transaction.commit();

        session.close();

        return booking;
    }

    @Override
    public Booking findbyId(int id) {
        Session session = this.sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Booking booking = session.get(Booking.class,id);
        transaction.commit();

        session.close();
        return booking;
    }

    @Override
    public Booking update(Booking booking) {
        Session session = this.sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.update(booking);
        transaction.commit();
        session.close();
        return booking;
    }

    @Override
    public void delete(Booking booking) {
        Session session = this.sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Booking mergedBooking = (Booking) session.merge(booking);

        session.delete(mergedBooking);
        transaction.commit();
        session.close();
    }
}
