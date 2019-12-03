package com.cn.dao;

import com.cn.domain.carts;

public interface cartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(carts record);

    int insertSelective(carts record);

    carts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(carts record);

    int updateByPrimaryKey(carts record);
}