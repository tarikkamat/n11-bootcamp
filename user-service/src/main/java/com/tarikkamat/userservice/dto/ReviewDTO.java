package com.tarikkamat.userservice.dto;

import java.util.UUID;

public record ReviewDTO(
        UUID id,
        String userId,
        String restaurantId,
        String comment,
        Double rating
) {
}
