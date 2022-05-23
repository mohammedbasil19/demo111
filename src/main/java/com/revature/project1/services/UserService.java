package com.revature.project1.services;

import com.revature.project1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void registerUser ();
    public Optional<User> login(User user);
    public List<User> getUser();
    public boolean existUser ();


}
