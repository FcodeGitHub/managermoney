package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.Dynamic;
import com.hy.moneyplanning.pojo.News;
import com.hy.moneyplanning.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> showList();

    List<Dynamic> dynamicsList();

    List<News> newsList();

    /**
     * 通过id查询
     */
    Project selectProjectDetailById(int id);
}
