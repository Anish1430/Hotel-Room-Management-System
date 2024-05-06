package com.Anish.Hotel.Room.Management.System.service;

import com.Anish.Hotel.Room.Management.System.model.Room;
import com.Anish.Hotel.Room.Management.System.model.Type;
import com.Anish.Hotel.Room.Management.System.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepo;
    public String addRoom(Room newRoom) {
        roomRepo.save(newRoom);
        return "Room Added";
    }


    public void getRoom() {
    }

    public List<Room> getRooms() {
        return (List<Room>) roomRepo.findAll();
    }

    public String addRooms(List<Room> newRooms) {
        roomRepo.saveAll(newRooms);
        return  newRooms.size()+" "+"NewRooms were Added";
    }

    public Room getRoomById(Integer id) {
        return roomRepo.findById(id).get();
    }

    public String removeRoomsByIds(List<Integer> ids) {
        roomRepo.deleteAllById(ids);
        return "removed rooms";
    }

    public List<Room> getPriceById(double price) {
        return   roomRepo.findByRoomPrice(price);
    }

    public List<Room> getAvailableRoomsBelowPrice(double price) {
        return roomRepo.findByRoomPriceLessThanEqualAndRoomAvailable(price,true);
    }


    public List<Room> getAvailableRoomsOrBelowRoomsPrice(double price) {
        return roomRepo.findByRoomPriceLessThanEqualOrRoomAvailable(price,true);
    }

    public List<Room> getAvailableRoomsOrAcSortedByPrice() {
        return roomRepo.findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type.AC,true);
    }

    public List<Room> getAvailableRoomsMoreRoomsPrice(double price) {
        return roomRepo.findByRoomPriceGreaterThanEqualAndRoomAvailable(price,true);
    }

//    public List<Room> getAvailableRoomsOrMoreRoomsPrice(Integer price) {
//        return roomRepo.findByRoomPriceGreaterThanEqualAndAvailable(price,true);
//    }

}