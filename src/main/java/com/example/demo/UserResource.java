package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    UserDaOService userService;

    @GetMapping(value="/user")
    public ResponseEntity<Object> getAllUser(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getAllUser());

    }

    @GetMapping(value="/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);

    }

    @PostMapping("/user")
    public ResponseEntity<Object> addUser(@RequestBody User user){
            User newUser=userService.saveUser(user);
            if(newUser==null) throw new UserNotFoundException("User not exist");
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

}
