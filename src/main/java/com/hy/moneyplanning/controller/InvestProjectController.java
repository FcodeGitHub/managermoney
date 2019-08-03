package com.hy.moneyplanning.controller;


import com.github.pagehelper.PageInfo;
import com.hy.moneyplanning.pojo.InvestProject;
import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.InvestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invest")
public class InvestProjectController {


    @Autowired
    InvestProjectService investProjectService;

    //展示投资项目
    @RequestMapping("/showInvestProject")
    public PageInfo<InvestProject> showInvestProject(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int pageSize){

        List<InvestProject> investProjectList = investProjectService.showInvestProject(page,pageSize);

        return new PageInfo<>(investProjectList);
    }

}
