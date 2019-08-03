package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    //登陆
    @RequestMapping("/login")
    public String UserLogin(User user, HttpSession session) {
        //System.out.println(user);
        String result = userService.selectUser(user);
        session.setAttribute("userName", user.getUserName());

        return result;
    }
    /**
     * 验证用户名/手机号是否存在
     */
    @RequestMapping("/selectByName")
    public String selectByName(String phoneNum) {
        // 调用方法查询
        boolean result = userService.selectByName(phoneNum);
        if (result){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 注册
     */
    @RequestMapping("/register")
    public String register(User user) {
        // 调用方法查询
        boolean result = userService.register(user);
        if (result){
            return "success";
        }else{
            return "false";
        }
    }
}
