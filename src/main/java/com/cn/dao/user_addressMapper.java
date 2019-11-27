package com.cn.dao;

import com.cn.domain.user_address;

public interface user_addressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_address record);

    int insertSelective(user_address record);

    user_address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_address record);

    int updateByPrimaryKey(user_address record);
}