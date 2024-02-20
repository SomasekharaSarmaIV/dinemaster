/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.dinemaster.repository;

import java.util.ArrayList;
import com.example.dinemaster.model.Restaurant;

// Write your code here
public interface RestaurantRepository {
  ArrayList<Restaurant> getRestaurants();

  Restaurant getRestaurantById(int restaurantId);
}