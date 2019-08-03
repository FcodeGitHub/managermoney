package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.InvestProject;

import java.util.List;

public interface InvestProjectService {
    List<InvestProject> showInvestProject(int page,int pageSize);
}
