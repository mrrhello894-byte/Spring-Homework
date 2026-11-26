package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.dto.CreateUserRequest;
import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserResponse> getAll();
    UserResponse getById(UUID id);
    User create(User user);
    void delete(UUID id);
    User createNew(CreateUserRequest createUserRequest);
    Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize);
}
