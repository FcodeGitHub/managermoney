package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.Project;
import com.hy.moneyplanning.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    /*
    * 查询项目列表
    * */
    @RequestMapping("/list")
    public List<Project> showList(){

        List<Project> projectList = projectService.showList();

        //System.out.println("666666");
        return projectList;
    }

}
