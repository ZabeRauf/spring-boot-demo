package com.zoobenmcdooben.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for the dependency injection
    @Autowired
    public demoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String welcome() {
        return "Hello Beautiful!";
    }

    @GetMapping("/dailymonologue")
    public String getDailyMonolgue() {
        return myCoach.getDailyMonologue();
    }
}
