package com.hy.moneyplanning.mapper;


import com.hy.moneyplanning.pojo.InvestProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InvestProjectMapper {
    List<InvestProject> showInvestProject(int page,int pageSize);
}
