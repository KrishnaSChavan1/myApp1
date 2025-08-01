package com.example.myApp1.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component("cricket")  // Makes the class as spring bean for dependency injection
public class CricketCoach implements Coach{
    @Autowired

    PersonDetails personDetails;


    @Autowired
    public CricketCoach(@Qualifier("detail") PersonDetails personDetails){
        this.personDetails = personDetails;
    }

    @GetMapping("/CricketWorkout")
    @Override
    public String getDailyWorkout(){
        return "Cricket Coach: " + personDetails.getName() + " " + personDetails.getLName() + " (ID: " + personDetails.getId() + ") says: Practice drills for 30 minutes.";

    }
}
