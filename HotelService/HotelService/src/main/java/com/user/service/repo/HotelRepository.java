package com.user.service.repo;

import com.user.service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel,String> {

}
