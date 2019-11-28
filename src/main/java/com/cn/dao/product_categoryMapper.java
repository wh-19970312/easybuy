package com.cn.dao;

import com.cn.domain.product_category;

import java.util.List;

public interface product_categoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(product_category record);

    int insertSelective(product_category record);

    product_category selectByPrimaryKey(Integer id);

    List<product_category> selectByType( Integer type);

    int updateByPrimaryKeySelective(product_category record);

    int updateByPrimaryKey(product_category record);
}