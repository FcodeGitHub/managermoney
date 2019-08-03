package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.UserMapper;
import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //验证账户是否存在
    @Override
    public List<User> validateName() {
        return userMapper.validateName();
    }

    //注册
    @Override
    public boolean register(User user) {
        boolean result = userMapper.register(user);
        if (result){
            return true;
        }else {
            return false;
        }
    }





}
