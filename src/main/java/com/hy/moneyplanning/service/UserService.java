package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.User;

public interface UserService {

    //登陆
    String selectUser(User user);

    //注册
    boolean register(User user);

    //验证账户是否存在
    boolean selectByName(String phoneNum);
}
