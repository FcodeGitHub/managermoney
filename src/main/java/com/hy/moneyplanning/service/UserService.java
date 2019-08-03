package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.User;

public interface UserService {


    //登陆
    String selectUser(User user);
    //验证账户是否存在

    //注册
    boolean register(User user);

}
