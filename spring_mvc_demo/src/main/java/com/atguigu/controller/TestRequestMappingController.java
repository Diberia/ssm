package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1.@RequestMapping注解标识的位置
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求请求路径的具体信息
 */

@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器方法所匹配的请求的请求路径为/test/hello
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
