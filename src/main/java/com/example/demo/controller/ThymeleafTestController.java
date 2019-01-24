package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/thymeleaf")
@Controller
public class ThymeleafTestController {

    /*
        访问静态页面方法
            ①：在src/main/resources/static文件夹下新建index.html
            ②：直接访问：http://localhost:8080/index.html
    */

    /*
        访问动态页面：需要thymeleaf依赖
    */
    @GetMapping("/templatesTest/{username}")
    public String templatesTest(@PathVariable(name="username") String username , Model model){
        model.addAttribute("username",username);
        return "/index";
    }

}
