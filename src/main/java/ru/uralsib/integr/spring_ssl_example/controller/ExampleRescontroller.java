package ru.uralsib.integr.spring_ssl_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRescontroller {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
