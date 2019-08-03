package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    Notice showInfo(int id);
}
