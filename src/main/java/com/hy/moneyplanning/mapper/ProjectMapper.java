package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> showList();

    List<Dynamic> dynamicsList();

    List<News> newsList();

    List<Notice> showInfo();

    List<Top> showTop();
    /**
     * 通过id查询
     */
    Project selectProjectDetailById(int id);

    /**
     * 通过项目id查询项目描述
     */
    Company selectProjectById(int id);

    /**
     * 通过项目id查询风控信息
     */
    ControlInfo selectControlInfo(int id);

    /**
     * 通过id查询保障措施kkkkk
     */
    Safety selectSafety(Integer safetyId);

    /**
     * 通过id查询风险控制措施
     */
    RiskControl selectRiskControl(Integer riskcontrolId);


    List<Project> showRecommendList();

    /**
     * 通过项目id查询贷后管理
     */
    Manage selectManage(int id);

    /**
     * 查询还款明细
     */
    List<Repay> selectRepay(int id);

    /**
     * 通过项目id查询投标记录
     */
    List<RecordUser> selectRecord(int id);

    /**
     * 通过项目id查询有多少人投
     */
    int selectRecordCount(int id);
    int selectAllMoney();

    int selectPeoples();
}
