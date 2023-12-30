package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DramaCoach implements Coach {
    @Override
    public String getDailyMonologue() {
        return "Read the Saving Private Ryan monologue.";
    }
}
