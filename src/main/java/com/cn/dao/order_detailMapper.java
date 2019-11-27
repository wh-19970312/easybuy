package com.cn.dao;

import com.cn.domain.order_detail;

public interface order_detailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(order_detail record);

    int insertSelective(order_detail record);

    order_detail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(order_detail record);

    int updateByPrimaryKey(order_detail record);
}