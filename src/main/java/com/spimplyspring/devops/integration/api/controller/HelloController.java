package com.spimplyspring.devops.integration.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello, There! Welcome to Jenkins World";
    }
}
