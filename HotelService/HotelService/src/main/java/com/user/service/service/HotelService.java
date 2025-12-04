package com.user.service.service;

import com.user.service.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel get(String id);
}
