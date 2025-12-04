package com.rating.RatingService.service.service.impl;

import com.rating.RatingService.entities.Rating;
import com.rating.RatingService.repository.RatingRepository;
import com.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRatingById(String id) {
        return ratingRepository.getReferenceById(id);
    }

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatingsBYUserid(String userId) {
        return ratingRepository.findRatingByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findRatingByHotelId(hotelId);
    }
}
