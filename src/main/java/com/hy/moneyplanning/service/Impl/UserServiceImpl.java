package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.UserMapper;
import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public String selectUser(User user) {
        int result = userMapper.selectuser(user);
        System.out.println(result);
        if (result>0){
            return "success";
        }else {
            return "fail";
        }

    }

    //注册
    @Override
    public boolean register(User user) {
       int result = userMapper.register(user);
    return result>0?true :false;
    }

    //验证账户是否存在
    @Override
    public boolean selectByName(String phoneNum) {
        int result = userMapper.selectByPhoneNum(phoneNum);
        return result> 0 ? true :false;
    }


}
