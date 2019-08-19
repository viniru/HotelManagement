package com.vinayak.project.HotelManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("CheckIn")
    private int checkIn;

    @JsonProperty("Username")
    private String username;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;


    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", checkIn=" + checkIn +
                ", username='" + username + '\'' +
                '}';
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public String getUsernamme() {
        return username;
    }

    public void setUsernamme(String usernamme) {
        this.username = usernamme;
    }


}
