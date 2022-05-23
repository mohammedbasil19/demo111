package com.revature.project1.services;

import com.revature.project1.model.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public void registerUser() {

    }

    @Override
    public Optional<User> login(User user) {
        return Optional.empty();
    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public boolean existUser() {
        return false;
    }
}
