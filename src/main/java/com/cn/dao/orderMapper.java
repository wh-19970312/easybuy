package com.cn.dao;

import com.cn.domain.order;

import java.util.List;

public interface orderMapper {
    void deleteByPrimaryKey(Integer id);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(order record);


    int updateByPrimaryKey(order record);

    List<order> selectall();

    List<order> selectorderby(order order);

}