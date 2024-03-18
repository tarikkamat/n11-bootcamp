package com.tarikkamat.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RestaurantAverageRating {
    private UUID restaurantId;
    private double averageRating;
}
