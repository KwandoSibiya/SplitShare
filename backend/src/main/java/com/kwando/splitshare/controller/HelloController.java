package com.kwando.splitshare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Helllo world from SplitShare backend";
    }

    @GetMapping("/")
    public String home(){
        return "SplitShare API is running!";
    }
}