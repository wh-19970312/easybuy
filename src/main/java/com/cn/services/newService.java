package com.cn.services;

import com.cn.domain.*;

import java.util.List;

public interface newService {
    List<news> allNews();
    List<user> selectall();
    void  deleteByPrimaryKey(int id);

    void  deleteByPrimaryKeynews(int id);
    void updateByPrimaryKeySelective(user user);
    void updateByPrimaryKeySelective(user_address record);
    void insertuser(user user);
    void insertuseraddress(user_address record);
    user selectbyidcard(String identityCode);
    List<order> selectallorders();
    List<order> selectorderby(order order);

    void updateByPrimaryKeySelective(order record);

    void  deleteorderByPrimaryKey(int id);

    void updateByPrimaryKeynews(news record);

    List<note> findallnotes();
    void updatenotes(note note);

}
