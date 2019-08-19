package com.vinayak.project.HotelManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Room {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("hotel")
    private String  hotelName;

    @JsonProperty("room")
    private String  roomNumber;

    @JsonProperty("ac")
    private boolean airCondition;

    @JsonProperty("beds")
    private int     numberOfBeds;

    @OneToOne(mappedBy = "room",fetch = FetchType.LAZY)
    private Booking booking;

/*
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "room")
    private Booking booking;


    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


*/

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", airCondition=" + airCondition +
                ", numberOfBeds=" + numberOfBeds +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

}
