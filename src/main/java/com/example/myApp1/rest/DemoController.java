package com.example.myApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DemoController {
    private Coach coach;
    private Coach c;
    private Coach v;
    private Coach vo;

    @Autowired
    public void setCoach(@Qualifier("volleyballCoach") Coach coach,
                         @Qualifier("volleyballCoach") Coach c,
                         @Qualifier("cricketCoach") Coach v,
                         @Qualifier("cricketCoach") Coach vo){
        System.out.println("In " + getClass().getSimpleName());
        this.coach=coach;
        this.c=c;
        this.v=v;
        this.vo=vo;
    }

    @GetMapping("/Workout")
    public String getWorkout(){

        return coach.getDailyWorkout();
    }

    @GetMapping("/Work")
    public String getWork(){

        return c.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Ans = " +c +"     " + coach;
    }
    @GetMapping("/checkit")
    public String checkit(){
        return "Ans = " +v +"     " + vo;
    }
}
