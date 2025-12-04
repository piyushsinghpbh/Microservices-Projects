package com.rating.RatingService.controllers;

import com.rating.RatingService.entities.Rating;
import com.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create( @RequestBody  Rating rating){
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
       Rating created_rating =  ratingService.createRating(rating);

       return ResponseEntity.status(HttpStatus.CREATED).body(created_rating);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> getAllRating = ratingService.getAllRatings();
        return ResponseEntity.ok(getAllRating);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId){
        List<Rating> getAllRating = ratingService.getRatingsBYUserid(userId);
        return ResponseEntity.ok(getAllRating);
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId){
        List<Rating> getAllRating = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(getAllRating);
    }

}
