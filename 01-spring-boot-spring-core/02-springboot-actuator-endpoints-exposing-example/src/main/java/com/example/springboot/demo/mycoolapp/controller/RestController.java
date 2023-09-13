package com.example.springboot.demo.mycoolapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //expose new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return " Run a hard 5k";
    }

}
