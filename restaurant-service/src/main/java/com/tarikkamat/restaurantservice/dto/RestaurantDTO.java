package com.tarikkamat.restaurantservice.dto;

import java.util.UUID;

public record RestaurantDTO(
        UUID id,
        String name,
        Double latitude,
        Double longitude
) {
}
