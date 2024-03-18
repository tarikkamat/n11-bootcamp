package com.tarikkamat.restaurantservice.controller.contract;

import com.tarikkamat.restaurantservice.dto.RestaurantDTO;
import com.tarikkamat.restaurantservice.request.RestaurantSaveRequest;
import com.tarikkamat.restaurantservice.request.RestaurantUpdateRequest;

import java.util.List;
import java.util.UUID;

public interface RestaurantControllerContract {

    RestaurantDTO addRestaurant(RestaurantSaveRequest request);

    List<RestaurantDTO> getAllRestaurants();

    RestaurantDTO getRestaurantById(UUID id);

    void deleteRestaurantById(UUID id);

    RestaurantDTO updateRestaurantById(RestaurantUpdateRequest request);

    RestaurantDTO updateRestaurantNameById(RestaurantUpdateRequest request);

    RestaurantDTO updateRestaurantLocationById(RestaurantUpdateRequest request);

}
