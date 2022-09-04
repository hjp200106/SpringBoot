package com.hjp.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        System.out.println("hello");
        System.out.println("hello1");
        System.out.println("master");
        return "hello,SpringBoot2!";
    }

}
