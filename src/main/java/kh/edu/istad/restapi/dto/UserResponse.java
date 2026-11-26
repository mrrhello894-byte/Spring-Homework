package kh.edu.istad.restapi.dto;

import kh.edu.istad.restapi.model.User;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        Boolean isActive) {

}
