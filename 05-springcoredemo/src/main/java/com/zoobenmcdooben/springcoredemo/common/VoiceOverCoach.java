package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VoiceOverCoach implements Coach {

    public VoiceOverCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyMonologue() {
        return "Read the Saint Attilia Holy Hand Grenade monologue.";
    }
}
