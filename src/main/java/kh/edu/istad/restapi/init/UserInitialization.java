package kh.edu.istad.restapi.init;

import jakarta.annotation.PostConstruct;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserInitialization {
    private final UserRepository userRepository;
    @PostConstruct
    void init() {
        log.info("Initilizing user data ...");
//        create entity object
        User user = new User();
        user.setUsername("Administartor");
        user.setName("admin11");
        user.setPassword("password");
        user.setIsActive(Boolean.TRUE);

       userRepository.save(user);
    }
}
