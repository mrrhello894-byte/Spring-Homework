package kh.edu.istad.restapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="m2_users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.UUID)
 private UUID id;
 @Column(length = 50, nullable = false)
 private String name;
 @Column(length = 32, nullable = false, unique = true)
 private String username;
 @Column(nullable = false)
 private String password;
 @Column(nullable = false)
 private Boolean isActive;


 @OneToOne(mappedBy = "user")
 private Customer customer;


}
