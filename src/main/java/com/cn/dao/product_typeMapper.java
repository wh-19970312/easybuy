package com.cn.dao;

import com.cn.domain.product_type;

import java.util.List;

public interface product_typeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(product_type record);

    int insertSelective(product_type record);

    product_type selectByPrimaryKey(Integer id);

    List<product_type> findType();

    int updateByPrimaryKeySelective(product_type record);

    int updateByPrimaryKey(product_type record);
}