package com.example.activiti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @RequestMapping("/test")
    public void test(HttpServletRequest request){
        System.out.println("success"+request.getSession().getMaxInactiveInterval());
    }
}
