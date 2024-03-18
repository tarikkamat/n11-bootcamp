package com.tarikkamat.restaurantservice.dao;

import com.tarikkamat.restaurantservice.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {

    @Query(value = "SELECT * FROM restaurant WHERE (6371 * acos(cos(radians(:latitude)) * cos(radians(latitude)) *" +
            " cos(radians(longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(latitude)))) <= :distance", nativeQuery = true)
    List<Restaurant> findRestaurantsNearby(@Param("latitude") Double latitude, @Param("longitude") Double longitude, @Param("distance") Double distance);

}
