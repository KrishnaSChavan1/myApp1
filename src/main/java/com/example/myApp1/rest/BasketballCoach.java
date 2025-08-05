package com.example.myApp1.rest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("In " + getClass().getSimpleName());
    }
    public String getDailyWorkout(){
        return "Play Basketball";
    }
}
