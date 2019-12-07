package com.cn.services.Impl;

import com.cn.dao.*;
import com.cn.domain.*;
import com.cn.services.ProductService;
import com.cn.services.newService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newServicesImpl implements newService {
    @Autowired
    newsMapper mapper;
    @Autowired
    com.cn.dao.userMapper userMapper;
    @Autowired
    user_addressMapper userAddressMapper;
    @Autowired
    com.cn.dao.orderMapper orderMapper;
    @Autowired
    newsMapper newsMapper;
    @Autowired
    com.cn.dao.noteMapper noteMapper;
    @Override
    public List<news> allNews() {
        return mapper.findAll();
    }

    @Override
    public List<user> selectall() {
        return userMapper.selectall();
    }

    public  void deleteByPrimaryKey(int id){
        userMapper.deleteByPrimaryKey(id);
    }

    public  void deleteByPrimaryKeynews(int id){
        newsMapper.deleteByPrimaryKey(id);
    }

    public void updateByPrimaryKeySelective(user user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void updateByPrimaryKeySelective(user_address record){
        userAddressMapper.updateByPrimaryKeySelective(record);
    }

    public void insertuser(user user){
        userMapper.insertSelective(user);
    }

    public void insertuseraddress(user_address record){
        userAddressMapper.insertSelective(record);
    }

    public user selectbyidcard(String identityCode){
        return userMapper.selectbyidcard(identityCode);
    }

    public List<order> selectallorders(){
        return orderMapper.selectall();
    }
    public List<order> selectorderby(order order){
        return orderMapper.selectorderby(order );
    }

    public void updateByPrimaryKeySelective(order record){
        orderMapper.updateByPrimaryKeySelective(record);
    }

    public void  deleteorderByPrimaryKey(int id){
        orderMapper.deleteByPrimaryKey(id);
    }

    public void updateByPrimaryKeynews(news record){
        newsMapper.updateByPrimaryKeySelective(record);
    }

    public  List<note> findallnotes(){
        return  noteMapper.findAllnote();
    }

    public void updatenotes(note note){
        noteMapper.updateByPrimaryKey(note);
    }

}
