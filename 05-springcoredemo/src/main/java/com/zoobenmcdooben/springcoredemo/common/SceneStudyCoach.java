package com.zoobenmcdooben.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Lazy Initialization: Instead of creating all beans up front,
// they will only init when needed for dependency injection or it is explicitly requested.
// For this, we add the @Lazy annotation to a given class.

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SceneStudyCoach implements Coach {

    public SceneStudyCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyMonologue() {
        return "Read some material, block it out, rehearse it, and act it out. Get iiiiit!";
    }
}
