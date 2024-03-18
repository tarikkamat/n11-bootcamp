package com.tarikkamat.userservice.request;

public record ReviewSaveRequest(
        String userId,
        String restaurantId,
        String comment,
        Integer rating
) {
}
