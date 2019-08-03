package com.hy.moneyplanning.service.Impl;

import com.github.pagehelper.PageHelper;
import com.hy.moneyplanning.mapper.InvestProjectMapper;
import com.hy.moneyplanning.pojo.InvestProject;
import com.hy.moneyplanning.service.InvestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestProjectServiceImpl implements InvestProjectService {


    @Autowired
    InvestProjectMapper investProjectMapper;

    @Override
    public List<InvestProject> showInvestProject(int page,int pageSize) {

        PageHelper.startPage(page,pageSize);
        return investProjectMapper.showInvestProject(page,pageSize);
    }
}
