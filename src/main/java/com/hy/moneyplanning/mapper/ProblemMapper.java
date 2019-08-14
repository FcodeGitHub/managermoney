package com.hy.moneyplanning.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.parsing.Problem;

import java.util.List;

@Mapper
public interface ProblemMapper {

    //通过id展示问题页面数据
    List<Problem> showInfo();
}
