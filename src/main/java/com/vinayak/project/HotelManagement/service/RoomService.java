package com.vinayak.project.HotelManagement.service;

import com.vinayak.project.HotelManagement.dao.RoomDAO.BookingDAO;
import com.vinayak.project.HotelManagement.dao.RoomDAO.RoomDAO;
import com.vinayak.project.HotelManagement.model.Booking;
import com.vinayak.project.HotelManagement.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomService{

    @Autowired
    private RoomDAO roomDAO;

    @Autowired
    private BookingDAO bookingDAO;

    public Room addRoom(Room room){
       return roomDAO.save(room);
    }

    public List<Room> getRooms(){
        return roomDAO.findAll();
    }

    public Room getRoom(int roomId){
    return roomDAO.findById(roomId).orElse(new Room());
    }

    public Room updateRoom(int roomId, Room newRoom){
        newRoom.setId(roomId);
        return roomDAO.save(newRoom);
         
    }

    public void deleteRoom(int roomId){
        roomDAO.deleteById(roomId);
    }

    public Booking addBooking(int roomId, Booking booking){
        booking.setRoom(roomDAO.findById(roomId).orElse(new Room()));
        return booking;
    }

    public List<Booking> getBookings(){
        return bookingDAO.findAll();
    }

    public Booking getBooking(int bookingId){
        return bookingDAO.findById(bookingId).orElse(new Booking());
    }

}
