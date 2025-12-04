package com.rating.RatingService.service;

import com.rating.RatingService.RatingServiceApplication;
import com.rating.RatingService.entities.Rating;

import java.util.List;


    public interface RatingService {

    List<Rating> getAllRatings();

    Rating getRatingById(String id);

    Rating createRating(Rating rating);

    List<Rating> getRatingsBYUserid(String userIdd);

    List<Rating> getRatingByHotelId(String hotelId);
}
