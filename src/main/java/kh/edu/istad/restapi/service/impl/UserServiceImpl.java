package kh.edu.istad.restapi.service.impl;

import kh.edu.istad.restapi.dto.CreateUserRequest;
import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.mapper.UserMapper;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return userRepository.findAll(pageable).map(userMapper::mapUserToUserResponse);
    }

    @Override
    public List<UserResponse> getAll() {
        return userRepository.findAll().stream().map(userMapper::mapUserToUserResponse).toList();
    }

    @Override
    public UserResponse getById(UUID id) {
        return userRepository.findById(id).map(userMapper::mapUserToUserResponse).orElse(null);
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public User createNew(CreateUserRequest createUserRequest) {
        return null;
    }


    public void deleteById(UUID id) {
        userRepository.deleteById(id);
    }
}
