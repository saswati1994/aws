package com.demo.aurora.poc.crudapp.controller;


import com.demo.aurora.poc.crudapp.models.User;
import com.demo.aurora.poc.crudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/users")
    public String addUsers(@RequestBody User user){

        User us = new User();
        us.setName(user.getName());
        us.setEmail(user.getEmail());
        us.setId(user.getId());
        userRepository.save(us);

        return "User Added";


    }


    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
}
