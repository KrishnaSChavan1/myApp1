package com.example.myApp1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempClass {
    @Value("${coach.name}")
    private String name;

    @Value("${team.password}")
    private String password;

    @GetMapping("/")
    public String sayHello(){
        return "Hello how are you i am good " + name+" S Chavan";
    }

    @GetMapping("/Home")
    public String homePage(){
        return "You are at home page";
    }

    @GetMapping("/password")
    public String passwordPage(){
        return password;
    }
}
