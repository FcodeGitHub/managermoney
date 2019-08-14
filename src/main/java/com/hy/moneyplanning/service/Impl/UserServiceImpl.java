package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.UserMapper;
import com.hy.moneyplanning.pojo.RecordUser;
import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.pojo.UserComment;
import com.hy.moneyplanning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public List<UserComment> selectUserComment(int id) {
        return userMapper.selectUserComment(id);
    }

    @Override
    public void insertUserComment(int id, String comment,String userName) {
        UserComment userComment = new UserComment();
        userComment.setComment(comment);
        userComment.setProjectId(id);
        userComment.setUserName(userName);
        userComment.setCreateTime(new Date());
        userMapper.insertUserComment(userComment);
    }

    @Override
    public boolean insertRecordUser(int id, double money,String userName) {
        RecordUser recordUser = new RecordUser();
        recordUser.setCreateTime(new Date());
        recordUser.setUserName(userName);
        recordUser.setMoney(money);
        recordUser.setProjectId(id);
        recordUser.setState("手动投标");
        int result = userMapper.insertRecordUser(recordUser);
        return result > 0;
    }
}
