package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 1.通过servletAPI获取
 * 只需要在控制器方法的形参位置设置HttpServletRequest类型的形参，
 * 就可以在控制器方法中使用request对象获取请求参数
 * 2.通过控制器方法的形参获取
 * 只需要在控制器方法的形参位置，设置一个形参，形参的名字要和请求参数的名字一致即可
 * 3.@RequestParam：将请求参数和控制器方法的形参绑定
 * @RequestParam注解的三个属性：value、required、defaultValue
 * value：设置和形参绑定的请求参数的名字
 * required：设置是否必须传输value所对应的请求参数，
 * 默认值为true，表示value所对应的请求参数必须传输，否则页面报错
 * 若设置为false，则表示value所对应的请求参数不是必须传输，若为传输，则形参值为null
 * defaultValue：设置当没有传输value所对应的请求参数时，为形参设置的默认值，此时和required属性值无关
 */
@Controller
public class TestParamController {
    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "userName",required = true,defaultValue = "hello") String username,
            String password
    ){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }
}
