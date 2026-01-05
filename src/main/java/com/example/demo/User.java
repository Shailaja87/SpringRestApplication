package com.example.demo;


import org.springframework.stereotype.Component;

//@Component
public class User {

    private Integer id;
    private String name;

    public User( Integer id,String name) {
        this.name = name;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
