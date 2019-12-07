package com.cn.dao;

import com.cn.domain.news;

import java.util.List;

public interface newsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(news record);

    List<news> findAll();

    int insertSelective(news record);

    news selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(news record);

    int updateByPrimaryKey(news record);
}