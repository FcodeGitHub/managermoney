package com.hy.moneyplanning.service.Impl;

import com.github.pagehelper.PageHelper;
import com.hy.moneyplanning.mapper.NoticeMapper;
import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    @Override
    public List<Notice> showNoticeList(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return noticeMapper.showNoticeList();
    }
}
