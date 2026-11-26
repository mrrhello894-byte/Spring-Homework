package kh.edu.istad.restapi.mapper;

import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface UserMapper {
UserResponse mapUserToUserResponse(User user);

}
