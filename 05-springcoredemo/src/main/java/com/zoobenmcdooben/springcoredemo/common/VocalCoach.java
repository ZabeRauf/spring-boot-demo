package com.zoobenmcdooben.springcoredemo.common;

public class VocalCoach implements Coach {

    public VocalCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyMonologue() {
        return "Sing along to the soft duets playlist. :D";
    }
}
