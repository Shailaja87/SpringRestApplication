package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaOService {
    List<User> userList=new ArrayList<>();

    @PostConstruct
    public void init(){
        userList.add(new User(1,"Adam"));
        userList.add(new User(2,"Eva"));

    }

    public List<User> getAllUser(){
        return userList;
    }

    public User getUser(int id){
        for(User user:userList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;

    }

}
