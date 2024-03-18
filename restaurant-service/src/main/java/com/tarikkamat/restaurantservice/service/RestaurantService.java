package com.tarikkamat.restaurantservice.service;

import com.tarikkamat.restaurantservice.dao.RestaurantRepository;
import com.tarikkamat.restaurantservice.entity.Restaurant;
import com.tarikkamat.restaurantservice.general.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService extends BaseEntityService<Restaurant, RestaurantRepository> {

    protected RestaurantService(RestaurantRepository repository) {
        super(repository);
    }

}