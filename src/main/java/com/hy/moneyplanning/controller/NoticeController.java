package com.hy.moneyplanning.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    /**
     * 查询所有公告
     */
    @RequestMapping("showNoticeList")
    public PageInfo<Notice> showNoticeList(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "7") int pageSize) {
        List<Notice> noticeList = noticeService.showNoticeList(page, pageSize);
        return new PageInfo<>(noticeList);
    }
}
