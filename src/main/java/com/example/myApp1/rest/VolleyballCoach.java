package com.example.myApp1.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VolleyballCoach implements Coach{

    public VolleyballCoach() {
        System.out.println("In " + getClass().getSimpleName());
    }
    public String getDailyWorkout(){
        return "Play Volleyball";
    }

    @PostConstruct
    public void startOfBean(){
        System.out.println("Volleyball Bean Started");
    }
    @PreDestroy
    public void endOfBean(){
        System.out.println("Volleyball Bean destroyed");
    }
}
