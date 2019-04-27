package com.xd.nacosdiscoverygateway.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

    @Value("${date:null}")
    private String date;

    @GetMapping("/config")
    public String configTest(){
        return "date:"+date;
    }
}
