package com.tarikkamat.restaurantservice.response;

import lombok.Getter;

import java.util.UUID;

@Getter
public class UserResponse {
    UUID id;
    String name;
    String username;
    Double latitude;
    Double longitude;
}
