package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.ProjectMapper;
import com.hy.moneyplanning.pojo.Dynamic;
import com.hy.moneyplanning.pojo.News;
import com.hy.moneyplanning.pojo.Project;
import com.hy.moneyplanning.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectMapper projectMapper;

    @Override
    public List<Project> showList() {

        return projectMapper.showList();
    }

    @Override
    public List<Dynamic> dynamicsList() {
        return projectMapper.dynamicsList();
    }

    @Override
    public List<News> newsList() {
        return projectMapper.newsList();
    }

    @Override
    public Project selectProjectDetailById(int id) {
        return projectMapper.selectProjectDetailById(id);
    }
}
