package com.example.myApp1.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("detail")
public class PersonDetails {
    private final String id;
    private final String name;
    private final String lName;

    @Autowired
    public PersonDetails(@Value("20") String id,@Value("Krishna") String name,@Value("Chavan") String lName){
        this.id = id;
        this.name = name;
        this.lName = lName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLName() {
        return lName;
    }


}
