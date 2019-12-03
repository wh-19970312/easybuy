package com.cn.dao;

import com.cn.domain.product;

import java.util.List;

public interface productMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(product record);

    int insertSelective(product record);

    product selectByPrimaryKey(Integer id);

    List<product> selectBylevalId(Integer id);

    List<product> selectByAll();

    int updateByPrimaryKeySelective(product record);

    int updateByPrimaryKey(product record);
}