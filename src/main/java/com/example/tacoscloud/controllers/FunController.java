package com.example.tacoscloud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
    @GetMapping("/")
    public String funMethod(){
        return "Hello World";
    }

}
