package com.zoobenmcdooben.springcoredemo.config;

import com.zoobenmcdooben.springcoredemo.common.Coach;
import com.zoobenmcdooben.springcoredemo.common.VocalCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActConfig {
    @Bean("musical")
    public Coach vocalCoach() {
        return new VocalCoach();
    }
}
