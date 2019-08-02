package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.User;

import java.util.List;

public interface UserService {

    //验证账户是否存在
    List<User> validateName();

    //注册
    int register(User user);


}
