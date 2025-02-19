package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Welcome to Jenkins Demo";
    }

    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name){
        return "Hello "+name +" Congratulations!";
    }

    // Testing github
    // Code
    // New Stuff
}
