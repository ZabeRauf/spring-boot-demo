package com.howto.springboot.demo.howtospringboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoRestController {
    // inject properties for team
    @Value("${team.lead}")
    private String teamLead;

    @Value("${team.name}")
    private String teamName;

    // expose "/" endpoint that returns hello beautiful
    @GetMapping("/")
    public String sayHello() {
        return "Hello Beautiful";
    }

    // expose endpoint for "workout/cardio"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Go do 30 minutes of cardio!";
    }

    // expose endpoint for studying
    @GetMapping("/study")
    public String getDailyStudy() {
        return "Study for a couple hours.";
    }

    // expose team info endpoint
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team Lead: " + teamLead + "\n" + "Team Name: " + teamName + "\n";
    }
}
