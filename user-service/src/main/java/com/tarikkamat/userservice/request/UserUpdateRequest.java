package com.tarikkamat.userservice.request;

import java.util.UUID;

public record UserUpdateRequest(
        UUID id,
        String name,
        String username,
        Double latitude,
        Double longitude
) {
}
