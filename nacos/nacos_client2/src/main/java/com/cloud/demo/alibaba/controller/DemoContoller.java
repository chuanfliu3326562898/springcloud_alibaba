package com.cloud.demo.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {

    @GetMapping(value = "/demo/{string}")
    public String demoTesting(@PathVariable("string") String string){
        return "hello" + string;
    }
}