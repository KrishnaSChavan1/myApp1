package com.example.myApp1.rest;


import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Just Swim";
    }
}
