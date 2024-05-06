package com.Anish.Hotel.Room.Management.System.repository;


import com.Anish.Hotel.Room.Management.System.model.Room;
import com.Anish.Hotel.Room.Management.System.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room,Integer> {


    List<Room> findByRoomPrice(double price);

    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(double price, boolean b);


    List<Room> findByRoomPriceLessThanEqualOrRoomAvailable(double price, boolean b);

    List<Room> findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type type, boolean b);

    List<Room> findByRoomPriceGreaterThanEqualAndRoomAvailable(double price, boolean b);


//
//    List<Room> findByRoomPriceGreaterThanEqualAndAvailable(Integer price, boolean b);
}