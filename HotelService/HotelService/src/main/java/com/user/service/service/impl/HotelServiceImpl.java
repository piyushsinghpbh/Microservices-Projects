package com.user.service.service.impl;

import com.user.service.entity.Hotel;
import com.user.service.repo.HotelRepository;
import com.user.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.getReferenceById(id);
    }
}
