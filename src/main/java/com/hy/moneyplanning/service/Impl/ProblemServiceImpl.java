package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.ProblemMapper;
import com.hy.moneyplanning.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    ProblemMapper problemMapper;


    @Override
    public List<Problem> showInfo() {

        return problemMapper.showInfo();
    }
}
