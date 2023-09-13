package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
