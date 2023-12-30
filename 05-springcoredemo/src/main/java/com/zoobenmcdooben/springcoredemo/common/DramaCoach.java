package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DramaCoach implements Coach {

    public DramaCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyMonologue() {
        return "Read the Saving Private Ryan monologue.";
    }
}
