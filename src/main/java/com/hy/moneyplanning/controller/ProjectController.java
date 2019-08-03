package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.*;
import com.hy.moneyplanning.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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


    /*查询行业动态列表*/
    @RequestMapping("/dynamicsList")
    public List<Dynamic> dynamicsList(){

        List<Dynamic> dynamicList = projectService.dynamicsList();

        return dynamicList;
    }

    /*查询媒体报道列表*/
    @RequestMapping("/newsList")
    public List<News> newsList(){

        List<News> newsList = projectService.newsList();

        return newsList;
    }

    //查询网站公告
    @RequestMapping("/webInfo")
    public List<Notice> showInfo(){

            List<Notice> webInfoList = projectService.showInfo();
        return webInfoList;
    }

    //排行榜展示
    @RequestMapping("/showTop")
    public List<Top> showTop(){

        List<Top> topList = projectService.showTop();
        return topList;
    }

    /**
     * 通过id查询
     */
    @RequestMapping("/selectProjectDetailById")
    public Project selectProjectDetailById(int id) {
        return projectService.selectProjectDetailById(id);
    }

}
