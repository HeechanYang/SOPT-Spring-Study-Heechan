package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}