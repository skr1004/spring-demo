package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){return "Welcome......please try /hi";}

    @GetMapping("/hi")
    public String sayHi(){return "Wecome to 2nd URL....";}
}
