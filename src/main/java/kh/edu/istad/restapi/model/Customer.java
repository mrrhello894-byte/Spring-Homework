package kh.edu.istad.restapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "m2_customers")
public class Customer {
    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(length = 11,nullable = false, unique = true)
    private  String phonNumber;
    @Column(length = 12,nullable = false,unique = true)
    private String email;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String address;
    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToOne
    private User user;
}
