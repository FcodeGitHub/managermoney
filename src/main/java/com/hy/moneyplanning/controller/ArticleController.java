package com.hy.moneyplanning.controller;


import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    //获取新闻信息
    @RequestMapping("/showInfo")
    public Notice showInfo(int id){

        Notice notice = articleService.showInfo(id);

        return notice;
    }

}
