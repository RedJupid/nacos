package com.xd.nacosdiscoverygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryGatewayApplication.class, args);
    }

}
