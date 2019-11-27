package com.cn.dao;

import com.cn.domain.result;

public interface resultMapper {
    int insert(result record);

    int insertSelective(result record);
}