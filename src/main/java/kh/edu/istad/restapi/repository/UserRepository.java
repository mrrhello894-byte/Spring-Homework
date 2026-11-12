package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.dto.CreateUserRequest;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public class UserRepository {
    private List<User> users;

    public UserRepository(){
        users = new ArrayList<>();
        User usrAdmin = new User(UUID.randomUUID(), "Adminstator" , "Admin" , "qwer" , true);
        User usrEditer = new User(UUID.randomUUID(), "Editor", "editor" , "qwer" ,false );
        User usrCoustomer = new User(UUID.randomUUID(), "Dom sava" , "domsava" , "qwer" , true);
        users.add(usrAdmin);
        users.add(usrEditer);
        users.add(usrCoustomer);
    }
    public List<User> selectAll(){
        return users;
    }
    public Optional<User> selectById(UUID id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User insert(CreateUserRequest createUserRequest){

        User newUser = new User();
        newUser.setId(UUID.randomUUID());
        newUser.setName(createUserRequest.name());
        newUser.setUsername(createUserRequest.username());
        newUser.setPassword(createUserRequest.password());
        newUser.setIsActive(true);

         users.add(newUser);
         return newUser;
    }

    public void deleteById(UUID id){
        users.removeIf(user -> user.getId().equals(id));
    }


}
