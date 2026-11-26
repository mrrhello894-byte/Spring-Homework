package kh.edu.istad.restapi.controller;

import kh.edu.istad.restapi.dto.CreateUserRequest;
import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/paging")
    public Page<UserResponse> getAllWithPaging(
            @RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "25") int pageSize
    ) {
        return userService.getAllWithPaging(pageNumber, pageSize);
    }



    private final UserService userService;
    @GetMapping()
    public List<UserResponse> getAll(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public UserResponse getUserById(@PathVariable UUID id){
        return userService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(
            @RequestBody CreateUserRequest createUserRequest
            ) {
        return userService.createNew(createUserRequest);
    }
//
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable UUID id) {
        userService.delete(id);
    }







}
