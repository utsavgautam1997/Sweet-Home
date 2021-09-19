package com.upgrad.Hotel.Room.Booking.App.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;




    @Entity
    @Table(name = "booking")
    public class Booking {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  int bookingid;


        @Column
        private LocalDateTime fromDate;

        @Column
        private LocalDateTime toDate;

        @Column(length = 20 )
        private  String aadharNumber ;

        @Column
        private  int noOfRoom ;

        @Column
        private  String roomNumber ;

        @Column(nullable = false)
        private  int roomPrice;

        @Column(columnDefinition = "0")
        private  String transactionId;

        @Column(nullable = false)
        private  LocalDateTime bookedOn ;

        public int getBookingid() {
            return bookingid;
        }

        public void setBookingid(int bookingid) {
            this.bookingid = bookingid;
        }

        public LocalDateTime getFromDate() {
            return fromDate;
        }

        public void setFromDate(LocalDateTime fromDate) {
            this.fromDate = fromDate;
        }

        public LocalDateTime getToDate() {
            return toDate;
        }

        public void setToDate(LocalDateTime toDate) {
            this.toDate = toDate;
        }

        public String getAadharNumber() {
            return aadharNumber;
        }

        public void setAadharNumber(String aadharNumber) {
            this.aadharNumber = aadharNumber;
        }

        public int getNoOfRoom() {
            return noOfRoom;
        }

        public void setNoOfRoom(int noOfRoom) {
            this.noOfRoom = noOfRoom;
        }

        public String getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }

        public int getRoomPrice() {
            return roomPrice;
        }

        public void setRoomPrice(int roomPrice) {
            this.roomPrice = roomPrice;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public LocalDateTime getBookedOn(LocalDateTime of) {
            return bookedOn;
        }

        public void setBookedOn(LocalDateTime bookedOn) {
            this.bookedOn = bookedOn;
        }


        @Override
        public String toString() {
            return "Booking{" +
                    "bookingid=" + bookingid +
                    ", fromDate=" + fromDate +
                    ", toDate=" + toDate +
                    ", aadharNumber='" + aadharNumber + '\'' +
                    ", noOfRoom=" + noOfRoom +
                    ", roomNumber='" + roomNumber + '\'' +
                    ", roomPrice=" + roomPrice +
                    ", transactionId='" + transactionId + '\'' +
                    ", bookedOn=" + bookedOn +
                    '}';
        }
    }


