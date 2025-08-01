package com.example.myApp1.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("football")
public class FootBallCoach implements Coach{
    PersonDetails personDetails;


    @Autowired
    public FootBallCoach(@Qualifier("detail") PersonDetails personDetails){
        this.personDetails = personDetails;
    }

    @Override
    public String getDailyWorkout(){

        return "Do Workout";
    }
}
