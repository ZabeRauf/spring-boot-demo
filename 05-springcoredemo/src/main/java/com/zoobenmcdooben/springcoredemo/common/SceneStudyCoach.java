package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SceneStudyCoach implements Coach {
    @Override
    public String getDailyMonologue() {
        return "Read the material, block it out, rehearse it, and act it out. Get iiiiit!";
    }
}
