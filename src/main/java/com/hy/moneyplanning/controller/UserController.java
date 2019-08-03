package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 验证用户名/手机号是否存在
     */
    @RequestMapping("/validateName")
    public List<User> validateName() {
        // 调用方法查询

      return null;
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
