package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.Dynamic;
import com.hy.moneyplanning.pojo.News;
import com.hy.moneyplanning.pojo.Project;

import java.util.List;

public interface ProjectService {
    List<Project> showList();

    List<Dynamic> dynamicsList();

    List<News> newsList();

    /**
     * 通过id查询
     */
    Project selectProjectDetailById(int id);
}
