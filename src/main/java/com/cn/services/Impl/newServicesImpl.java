package com.cn.services.Impl;

import com.cn.dao.newsMapper;
import com.cn.domain.news;
import com.cn.services.newService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newServicesImpl implements newService {
    @Autowired
    newsMapper mapper;
    @Override
    public List<news> allNews() {
        return mapper.findAll();
    }
}
