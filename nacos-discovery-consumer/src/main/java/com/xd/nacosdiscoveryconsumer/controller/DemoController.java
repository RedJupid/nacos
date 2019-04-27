package com.xd.nacosdiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RefreshScope
public class DemoController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test(String name){
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"demo?name="+name,String.class);
    }

    @Value("${name:null}")
    private String name;

    @Value("${age:0}")
    private Integer age;

    @GetMapping("/config")
    public String configTest(){
        return "name:"+name+",age:"+age;
    }

}
