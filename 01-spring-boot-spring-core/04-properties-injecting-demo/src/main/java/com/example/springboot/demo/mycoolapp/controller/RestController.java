package com.example.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //expose new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return " Run a hard 5k";
    }

    //expose new endpoint for "teamInfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return  "Coach name: "+coachName+ ", Team name: "+teamName;
    }

}
