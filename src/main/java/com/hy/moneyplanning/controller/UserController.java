package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    //登陆
    @RequestMapping("/login")
    public String UserLogin(User user, HttpSession session){
        //System.out.println(user);
       String result =  userService.selectUser(user);
       session.setAttribute("userName",user.getUserName());

       return result;

    }
}
