/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.dinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.dinemaster.model.Restaurant;

import com.example.dinemaster.service.RestaurantJpaService;

// Write your code here
@RestController
public class RestaurantController {
  @Autowired
  private RestaurantJpaService rjs;

  @GetMapping("/restaurants")
  public ArrayList<Restaurant> getRestaurants() {
    return rjs.getRestaurants();

  }

  @GetMapping("/restaurants/{restaurantId}")
  public Restaurant getRestaurantById(@PathVariable("restaurantId") int restaurantId) {
    return rjs.getRestaurantById(restaurantId);
  }

  

}