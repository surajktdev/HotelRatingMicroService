package com.hotel.service.HotelService.service;

import com.hotel.service.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {

    // Create
    Hotel create(Hotel hotel);

    //get all hotels
    List<Hotel> getAll();

    //get a single hotel
    Hotel getHotel(String id);

}
