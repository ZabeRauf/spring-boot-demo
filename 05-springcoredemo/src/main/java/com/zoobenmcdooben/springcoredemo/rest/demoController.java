package com.zoobenmcdooben.springcoredemo.rest;

import com.zoobenmcdooben.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for the dependency injection (constructor injection)
    @Autowired
    public demoController(@Qualifier("voiceOverCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // setter injection
    /*@Autowired
    public void setActingCoach(Coach theCoach) {
        myCoach = theCoach;
    }*/

    @GetMapping("/")
    public String welcome() {
        return "Hello Beautiful!";
    }

    @GetMapping("/dailymonologue")
    public String getDailyMonologue() {
        return myCoach.getDailyMonologue();
    }
}
