package com.example.myApp1.rest;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In " + getClass().getSimpleName());
    }
    public String getDailyWorkout(){
        System.out.println("Initilized");
        return "Just Do Workout Now Or Never ";
    }

}