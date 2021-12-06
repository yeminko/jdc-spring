package com.example.bootembededcontainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greet() {
        return "Hello from Tomcat Embedded container";
    }
}
