package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.pojo.UserComment;

import java.util.List;

public interface UserService {

    //登陆
    String selectUser(User user);

    //注册
    boolean register(User user);

    //验证账户是否存在
    boolean selectByName(String phoneNum);

    //查询用户评论
    List<UserComment> selectUserComment(int id);

    //添加用户评论
    void insertUserComment(int id, String comment,String userName);

    //投资
    boolean insertRecordUser(int id, double money,String userName);
}
