package com.chance.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chance.service.HelloService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/test")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("chance"));
        return hello;
    }
}
