package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Swim a 1000m as a warmup";
    }

    public  SwimCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
}
