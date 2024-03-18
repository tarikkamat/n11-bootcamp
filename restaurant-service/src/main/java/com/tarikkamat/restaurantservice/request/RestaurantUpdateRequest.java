package com.tarikkamat.restaurantservice.request;

import java.util.UUID;

public record RestaurantUpdateRequest(
        UUID id,
        String name,
        Double latitude,
        Double longitude
) {
}
