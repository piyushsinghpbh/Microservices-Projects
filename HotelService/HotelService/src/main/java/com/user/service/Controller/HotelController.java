package com.user.service.Controller;


import com.user.service.entity.Hotel;
import com.user.service.service.HotelService;
import com.user.service.service.impl.HotelServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping
    ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels= hotelService.getAllHotels();
        return ResponseEntity.ok(allHotels);

    }
    @GetMapping("/{id}")
    ResponseEntity<Hotel> getHotelById(@PathVariable String id){

        Hotel hotel= hotelService.get(id);
        return ResponseEntity.ok(hotel);
    }

    @PostMapping
    ResponseEntity<Hotel> createHotel(@RequestBody  Hotel hotel){
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
       Hotel created_hotel =  hotelService.createHotel(hotel);
       return ResponseEntity.status(HttpStatus.CREATED).body(created_hotel);
    }

}
