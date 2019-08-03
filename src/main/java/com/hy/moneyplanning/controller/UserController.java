package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    //登陆
    @RequestMapping("/login")
    public String UserLogin(User user){
        //System.out.println(user);
       String result =  userService.selectUser(user);

       return result;

    }
}
