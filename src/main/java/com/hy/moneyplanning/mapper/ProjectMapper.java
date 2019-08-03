package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> showList();

    List<Dynamic> dynamicsList();

    List<News> newsList();

    List<Notice> showInfo();

    List<Top> showTop();
}
