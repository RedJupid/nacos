package com.xd.nacosdiscoveryprovider.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(String name){
        return "hello"+name;
    }
}