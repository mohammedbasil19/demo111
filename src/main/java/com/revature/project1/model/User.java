package com.revature.project1.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="user2", schema="project1")
@Component
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //dont need to add any id number w/ this annotation
    private int userId;

    @Column(name="email")
    private String userEmail;
    @Column(name="password")
    private String userPassword;

    @OneToOne(mappedBy = "usertocart")
    private Cart cartrelationship;


}
