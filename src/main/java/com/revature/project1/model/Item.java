package com.revature.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Table(name="item2", schema = "project1")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //dont need to add any id number w/ this annotation
    private int itemId;
    @Column(name = "name")
    private String itemName;
    @Column(name = "price")
    private double itemPrice;
    @Column(name = "qoh")
    private int qoh;

}
