package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller("controller")
@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void saveUser(){
        userService.saveUser();
    }
}
