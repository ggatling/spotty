package com.example.spotty.service;

import com.example.spotty.model.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();

    public User createUser(User newUser);

}
