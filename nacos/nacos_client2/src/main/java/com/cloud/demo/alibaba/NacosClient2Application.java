package com.cloud.demo.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient2Application {
    public static void main(String args[]){
        SpringApplication.run(NacosClient2Application.class, args);
    }
}
