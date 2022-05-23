package com.revature.project1.controller;

import com.revature.project1.dao.UserDAO;
import com.revature.project1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //makes this class as a request handler
@RequestMapping("user") //localhost:8085/user

public class UserController {

    @Autowired()
    User user;

    @Autowired
    UserDAO userDAO;

    @GetMapping
    public String home() {
        return "Welcome to my home";
    }



    @PostMapping
    public boolean addUser(@RequestBody User user) {
        userDAO.save(user);
        return true;
    }

    @DeleteMapping("{pUserId}") //localhost:8080/user/
    public String deleteUser(@PathVariable("pUserId") int userId){
        userDAO.deleteById(userId);
        return "Deleted: " + userId;
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userDAO.save(user);
        return "Successfully updated user : " + user;
    }

//    @PostMapping
//    public String addUser() {
//        return "UserName";
//    }


}
