package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //验证账户是否存在
    List<User> validateName();

    //注册
    boolean register(User user);
}
