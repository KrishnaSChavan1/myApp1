package com.example.myApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public void setCoach(@Qualifier("volleyballCoach") Coach coach){
        System.out.println("In " + getClass().getSimpleName());
        this.coach=coach;

    }

    @GetMapping("/Workout")
    public String getWorkout(){

        return coach.getDailyWorkout();
    }
}
