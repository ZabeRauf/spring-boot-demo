package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VoiceOverCoach implements Coach {

    @Override
    public String getDailyMonologue() {
        return "Read the Saint Attilia Holy Hand Grenade monologue.";
    }
}
