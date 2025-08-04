package com.example.myApp1.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VolleyballCoach implements Coach{

//    public VolleyballCoach() {
//        System.out.println("In " + getClass().getSimpleName());
//    }
    public String getDailyWorkout(){
        return "Play Volleyball";
    }
}
