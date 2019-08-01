package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.Project;
import com.hy.moneyplanning.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping("/listss")
    @ResponseBody
    public List<Project> showList(){

        List<Project> projectList = projectService.showList();

        System.out.println("666666");
        return projectList;
    }

    @RequestMapping("/demo")
    @ResponseBody
    public List<Project> demo(){

        List<Project> projectList = projectService.showList();

        System.out.println("666666");
        return projectList;
    }
}
