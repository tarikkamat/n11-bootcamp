package com.tarikkamat.userservice.request;

public record UserSaveRequest(
        String name,
        String username,
        Double latitude,
        Double longitude
) {
}
