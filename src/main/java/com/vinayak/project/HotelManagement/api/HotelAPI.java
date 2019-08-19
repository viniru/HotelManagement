package com.vinayak.project.HotelManagement.api;

import com.vinayak.project.HotelManagement.model.Room;
import com.vinayak.project.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class HotelAPI {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public Room addCustomer(@RequestBody Room room){

        return roomService.addRoom(room);
    }

    @GetMapping
    public List<Room> getRooms(){
        return roomService.getRooms();
    }

    @GetMapping("/{roomId}")
    public Room getRoom(@PathVariable("roomId") int roomId){
        return roomService.getRoom(roomId);
    }

    @PutMapping("/{roomId}")
    public Room updateRoom(@PathVariable("roomId") int roomId, @RequestBody Room room){
       return roomService.updateRoom(roomId,room);
    }

    @DeleteMapping("/{roomId}")
    public void deleteRoom(@PathVariable int roomId){
        roomService.deleteRoom(roomId);
    }


}
