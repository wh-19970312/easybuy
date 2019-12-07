package com.cn.dao;



import com.cn.domain.note;

import java.util.List;

public interface noteMapper {
    List<note> findAllnote();

    void deleteByPrimaryKey(Integer id);

    void updateByPrimaryKey(note note);


}