package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    ProblemService problemService;

    //通过id查询每一条数据
    @RequestMapping("/selectById")
    public List<Problem> selectById(){
        List<Problem> problemList = problemService.showInfo();
    return problemList;
    }

}
