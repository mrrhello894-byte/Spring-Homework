package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


}
