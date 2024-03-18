package com.tarikkamat.userservice.request;

import java.util.UUID;

public record ReviewUpdateRequest(
        UUID id,
        String comment,
        Double rating
) {
}
