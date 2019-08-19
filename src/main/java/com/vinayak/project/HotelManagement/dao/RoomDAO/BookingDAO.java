package com.vinayak.project.HotelManagement.dao.RoomDAO;

import com.vinayak.project.HotelManagement.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDAO extends JpaRepository<Booking,Integer> {
    @Override
    List<Booking> findAll();

}
