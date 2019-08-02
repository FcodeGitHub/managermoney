package com.hy.moneyplanning.controller;

import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Notice> showNoticeList(int page, int pageSize, Model model) {
        model.addAttribute("h","hhhhh");
        return noticeService.showNoticeList(page,  pageSize);
    }
}
