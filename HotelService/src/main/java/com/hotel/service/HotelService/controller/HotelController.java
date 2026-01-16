package com.hotel.service.HotelService.controller;


import com.hotel.service.HotelService.entity.Hotel;
import com.hotel.service.HotelService.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;

    @PostMapping("/")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK
        ).body(hotelService.getHotel(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Hotel>> getALlHotel(){
        return ResponseEntity.ok(hotelService.getAll());
    }
}
