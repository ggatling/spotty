package com.example.spotty.controller;

import com.example.spotty.model.User;
import com.example.spotty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!!";
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }
}
