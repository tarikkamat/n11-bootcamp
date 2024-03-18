package com.tarikkamat.restaurantservice.response;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ReviewResponse {
    UUID id;
    String userId;
    String restaurantId;
    Double rating;
}
