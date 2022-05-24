package com.revature.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cart1", schema = "project1")


public class Cart{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//dont need to add any id number w/ this annotation
    private int cartId;


    @OneToOne
    @JoinTable(name="user_carts",
            joinColumns = {@JoinColumn(name = "cart1", referencedColumnName = "cartId")},
            inverseJoinColumns = {@JoinColumn(name = "user2", referencedColumnName ="userId")}
    )

    private User usertocart;

    public Cart(int cartId) {
        this.cartId=cartId;
    }


}
