package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")//相当于拦截localhost:8080/SpringMVC的网址,然后显示的是index.html中的内容
    public String portal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")//相当于拦截localhost:8080/SpringMVC/hello的网址,然后显示的是success.html中的内容
    public String hello(){
        return "success";
    }
}
