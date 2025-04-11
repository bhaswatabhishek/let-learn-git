package com.example.git_practise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/get")
    public String get(){
        return  "Hello Git hub";
    }
}
