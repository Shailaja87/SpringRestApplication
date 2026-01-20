package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaOService {
    static List<User> userList=new ArrayList<>();
    static{
       userList.add(new User(1,"Adam"));
        userList.add(new User(2,"Eva"));
        System.out.println("Shailaja");
    };
//    @PostConstruct
//    public void init(){
//
//
//    }

    public List<User> getAllUser(){
        return userList;
    }

    public User getUser(int id){
       User user=userList.stream().filter(n->n.getId()==id).findFirst().get();
        if(user==null) throw new UserNotFoundException("Did not find user");
        return user;
    }
    public User saveUser(User user){
//        if(userList.contains(user)) throw new UserNotFoundException("User Already exists");
        User ExistingUser=userList.stream().filter(n->n.getId()==user.getId()).findFirst().orElse(null);
        if(ExistingUser!=null){
            throw new UserNotFoundException("User Already exists");
        }
        userList.add(user);
        return user;
    }
}
