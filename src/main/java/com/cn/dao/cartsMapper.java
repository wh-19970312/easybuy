package com.cn.dao;

import com.cn.domain.carts;

import java.util.List;

public interface cartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(carts record);

    int insertSelective(carts record);

    List<carts> selectByUserId(Integer id);

    carts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(carts record);

    int updateByPrimaryKey(carts record);
}