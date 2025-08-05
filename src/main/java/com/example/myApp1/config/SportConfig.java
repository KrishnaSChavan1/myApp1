package com.example.myApp1.config;


import com.example.myApp1.rest.Coach;
import com.example.myApp1.rest.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swim")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
