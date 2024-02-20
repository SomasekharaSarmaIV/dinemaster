/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.dinemaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;
import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.repository.RestaurantJpaRepository;
import com.example.dinemaster.repository.RestaurantRepository;

// Write your code here
@Service
public class RestaurantJpaService implements RestaurantRepository {
  
  @Autowired
  private RestaurantJpaRepository rjr;

  @Override
  public ArrayList<Restaurant> getRestaurants() {
    List<Restaurant> l = rjr.findAll();
    ArrayList<Restaurant> a = new ArrayList<>(l);
    return a;

  }

  @Override
  public Restaurant getRestaurantById(int restaurantId){
    try{
      Restaurant res= rjr.findById(restaurantId).get();
      return res;
    }catch(Exception e){
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }
}