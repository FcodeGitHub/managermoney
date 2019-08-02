package com.hy.moneyplanning.service;

import com.hy.moneyplanning.pojo.Notice;

import java.util.List;

public interface NoticeService {
    /**
     * 查询所有公告
     */
    List<Notice> showNoticeList(int page, int pageSize);
}
