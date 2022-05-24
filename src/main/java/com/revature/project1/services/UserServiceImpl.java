package com.revature.project1.services;

import com.revature.project1.dao.UserDAO;
import com.revature.project1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import util.CheckEmail;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    CheckEmail checkEmail;
    @Autowired
    UserDAO userDAO;

    @Override
    public void registerUser(User user) {
        if (checkEmail.checkEmail(user.getUserEmail())) {
            userDAO.save(user);
        } else {
            System.out.println("Can't save user");
        }
    }

    @Override
    public Optional<User> login(User user) {
        return Optional.empty();
    }

    @Override
    public List<User> getUser() {
        return userDAO.findAll();
    }

    @Override
    public boolean existUser(int userId) {
        return userDAO.existsById(userId);
    }
}
