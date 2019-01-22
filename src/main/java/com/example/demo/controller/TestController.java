package com.example.demo.controller;

import com.example.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @Autowired
    private TestServiceImpl testService;
    @RequestMapping("/")
    public String test(){
        System.out.println("我是controller");
        System.out.println("controller开始");
        testService.test();
        System.out.println("controller结束");
        return "aaaaaaaaaabbbbbbbbbbbbbbbbcccccccccccccc";
    }
}
