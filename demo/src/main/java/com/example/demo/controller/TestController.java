package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @RequestMapping("/test")
    public void test(HttpServletRequest request){
        System.out.println("success"+request.getSession().getMaxInactiveInterval());
    }
    @RequestMapping("")
    public int hello(HttpServletRequest request){
        request.getSession().setMaxInactiveInterval(1);
        request.getSession().getId();
        System.out.println("hello"+request.getSession().getId());
        return request.getSession().getMaxInactiveInterval();
    }
}
