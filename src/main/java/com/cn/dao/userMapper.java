package com.cn.dao;

import com.cn.domain.user;

import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> selectall();

    user selectbyidcard(String a);

}