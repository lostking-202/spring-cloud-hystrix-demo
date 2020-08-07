package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1 {
    @RequestMapping("/hello1")
    public String sayHello(){
        return "hello";
    }
}
