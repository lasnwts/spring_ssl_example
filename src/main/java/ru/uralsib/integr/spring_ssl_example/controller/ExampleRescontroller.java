package ru.uralsib.integr.spring_ssl_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRescontroller {
//https://www.youtube.com/watch?v=rm9OKTSm-4A
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World! With new keys!";
    }
}
