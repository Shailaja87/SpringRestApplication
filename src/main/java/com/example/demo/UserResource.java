package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping(value="/user")
    public List<User> getAllUser(){
        return userService.getAllUser();

    }

    @GetMapping(value="/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);

    }


}
