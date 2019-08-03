package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int selectuser(User user);
}
