package com.zoobenmcdooben.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class SitComCoach implements Coach {
    @Override
    public String getDailyMonologue() {
        int temp = (Math.random() <= 0.5) ? 1 : 2;
        if(temp == 1) {
            return "Practice the Barney Miller script as Chris.";
        }
        else {
            return "Practice the Barney Miller script as Riley.";
        }
    }
}
