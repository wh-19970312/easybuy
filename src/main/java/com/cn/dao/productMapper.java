package com.cn.dao;

import com.cn.domain.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface productMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(product record);

    int insertSelective(product record);

    product selectByPrimaryKey(Integer id);

    List<product> selectBylevalId(Integer id);

    List<product> selectByList(@Param("list") Set list);

    List<product> selectByAll();

    int updateByPrimaryKeySelective(product record);

    int updateByPrimaryKey(product record);
}