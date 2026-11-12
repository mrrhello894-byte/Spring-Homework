package kh.edu.istad.restapi.dto;

import java.util.UUID;

public record CreateUserRequest(

        String name,

        String username,

        String password


) {
}
