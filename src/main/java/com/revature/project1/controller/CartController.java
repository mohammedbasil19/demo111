package com.revature.project1.controller;


import com.revature.project1.dao.CartDAO;
import com.revature.project1.dao.ItemDAO;
import com.revature.project1.model.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("cart" )//localhost:8085/cart
public class CartController {

    @Autowired
    CartDAO cartDAO;

    @Autowired
    Cart cart;



    @PostMapping
    public boolean addCart(@RequestBody  Cart cart){
        cartDAO.save(cart);
        return true;
    }
    @GetMapping("{pCartId}")
    public Cart getCart(@PathVariable("pCartId") int cartId){
        Cart cart = new Cart(cartId);
        return cart;

    }
   /* @PutMapping
    public String updateCart(@RequestBody Item item){
        itemDAO.save(item);
        return "item saved successfully";
    }*/
}


