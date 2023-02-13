package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    //根据用户名查询用户信息
    User getUserByUsername(String username);

    //验证登录
    User checkLogin(String username,String password);

    //验证登录（以map集合作为参数）
    User checkLoginByMap(Map<String,Object> map);

    //添加用户信息
    void insertUser(User user);

    //验证登录（使用@param）
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
