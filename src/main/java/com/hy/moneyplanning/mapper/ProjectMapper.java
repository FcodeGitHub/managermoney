package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> showList();
}
