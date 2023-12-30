package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SceneStudyCoach implements Coach {
    @Override
    public String getDailyMonologue() {
        return "Read some material, block it out, rehearse it, and act it out. Get iiiiit!";
    }
}
