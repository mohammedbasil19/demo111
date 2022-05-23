package com.revature.project1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name="user1", schema="project1")
@Component
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    private int userId;
    @Column(name="email")
    private String userEmail;
    private String userPassword;
}
