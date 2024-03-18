package com.tarikkamat.userservice.dto;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String username,
        String name,
        Double latitude,
        Double longitude
) {
}
