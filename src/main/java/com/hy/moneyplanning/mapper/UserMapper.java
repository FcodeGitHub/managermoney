package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.User;
import com.hy.moneyplanning.pojo.UserComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int selectuser(User user);

    //注册
    int register(User user);

    //验证账户是否存在
    int selectByPhoneNum(String phoneNum);

    //查询用户评论
    List<UserComment> selectUserComment(int id);

    //新增用户评论
    void insertUserComment(UserComment userComment);
}
