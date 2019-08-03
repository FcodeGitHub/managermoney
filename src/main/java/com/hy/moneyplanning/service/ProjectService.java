package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.*;

import java.util.List;

public interface ProjectService {
    List<Project> showList();

    List<Dynamic> dynamicsList();

    List<News> newsList();

    List<Notice> showInfo();

    List<Top> showTop();
    /**
     * 通过id查询
     */
    Project selectProjectDetailById(int id);
}
