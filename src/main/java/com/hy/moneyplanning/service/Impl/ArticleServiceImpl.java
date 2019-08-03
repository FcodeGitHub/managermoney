package com.hy.moneyplanning.service.Impl;

import com.hy.moneyplanning.mapper.ArticleMapper;
import com.hy.moneyplanning.pojo.Notice;
import com.hy.moneyplanning.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Notice showInfo(int id) {
        return articleMapper.showInfo(id);
    }
}
