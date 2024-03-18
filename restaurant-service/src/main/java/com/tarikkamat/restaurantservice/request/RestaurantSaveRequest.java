package com.tarikkamat.restaurantservice.request;

public record RestaurantSaveRequest(
        String name,
        Double latitude,
        Double longitude
) {
}
