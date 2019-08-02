package com.hy.moneyplanning.mapper;

import com.hy.moneyplanning.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    /**
     * 查询所有公告
     */
    List<Notice> showNoticeList();
}
