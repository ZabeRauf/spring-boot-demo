package com.zoobenmcdooben.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// Lazy Initialization: Instead of creating all beans up front,
// they will only init when needed for dependency injection or it is explicitly requested.
// For this, we add the @Lazy annotation to a given class.

@Component
public class SceneStudyCoach implements Coach {

    public SceneStudyCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doStartup() {
        System.out.println("In doStartup: " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void doCleanup() {
        System.out.println("In doCleanup: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyMonologue() {
        return "Read some material, block it out, rehearse it, and act it out. Get iiiiit!";
    }
}
