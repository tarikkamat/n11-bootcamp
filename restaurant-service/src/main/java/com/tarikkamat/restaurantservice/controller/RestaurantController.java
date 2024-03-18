package com.tarikkamat.restaurantservice.controller;

import com.tarikkamat.restaurantservice.controller.contract.RestaurantControllerContract;
import com.tarikkamat.restaurantservice.dto.RestaurantDTO;
import com.tarikkamat.restaurantservice.request.RestaurantSaveRequest;
import com.tarikkamat.restaurantservice.request.RestaurantUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {

    private final RestaurantControllerContract restaurantControllerContract;

    @Autowired
    public RestaurantController(RestaurantControllerContract restaurantControllerContract) {
        this.restaurantControllerContract = restaurantControllerContract;
    }

    @PostMapping
    public RestaurantDTO addRestaurant(@RequestBody RestaurantSaveRequest request) {
        RestaurantDTO restaurantDTO = restaurantControllerContract.addRestaurant(request);
        return restaurantDTO;
    }

    @GetMapping
    public List<RestaurantDTO> getAllRestaurants() {
        List<RestaurantDTO> restaurantDTOs = restaurantControllerContract.getAllRestaurants();
        return restaurantDTOs;
    }

    @GetMapping("/{id}")
    public RestaurantDTO getRestaurantById(@PathVariable("id") UUID id) {
        RestaurantDTO restaurantDTO = restaurantControllerContract.getRestaurantById(id);
        return restaurantDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurantById(@PathVariable("id") UUID id) {
        restaurantControllerContract.deleteRestaurantById(id);
    }

    @PutMapping("/{debugId}")
    public RestaurantDTO updateRestaurantById(@PathVariable("debugId") UUID debugId, @RequestBody RestaurantUpdateRequest request) {
        RestaurantDTO restaurantDTO = restaurantControllerContract.updateRestaurantById(request);
        return restaurantDTO;
    }

    @PutMapping("/{debugId}/name")
    public RestaurantDTO updateRestaurantNameById(@PathVariable("debugId") UUID id, @RequestBody RestaurantUpdateRequest request) {
        RestaurantDTO restaurantDTO = restaurantControllerContract.updateRestaurantNameById(request);
        return restaurantDTO;
    }

    @PutMapping("/{id}/location")
    public RestaurantDTO updateRestaurantLocationById(@PathVariable("id") UUID id, @RequestBody RestaurantUpdateRequest request) {
        RestaurantDTO restaurantDTO = restaurantControllerContract.updateRestaurantLocationById(request);
        return restaurantDTO;
    }

}
