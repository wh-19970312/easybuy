package com.cn.services.Impl;

import com.cn.dao.productMapper;
import com.cn.dao.product_typeMapper;
import com.cn.domain.product;
import com.cn.domain.product_type;
import com.cn.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.*;

@Service
public class productServiceImpl implements ProductService {
    @Autowired
    private product_typeMapper mapper;
    @Autowired
    private productMapper product;

    @Override
    public List<product_type> findAll() {
        return mapper.findType();
    }

    @Override
    public List<product> selectProduct(Integer id) {
        return product.selectBylevalId(id);
    }

    @Override
    public List<com.cn.domain.product> selectAll() {
        return product.selectByAll();
    }

    @Override
    public com.cn.domain.product selectById(Integer id) {
        return product.selectByPrimaryKey(id);
    }

    @Override
    public List<com.cn.domain.product> selectByList(HttpServletRequest request) {
        Set set=new HashSet<Integer>();
        HttpSession session = request.getSession();
        List list =(List)session.getAttribute("list");
        for (int i=list.size()-1;i>0;i--){
            set.add(list.get(i));
            if (set.size()>5){
                break;
            }
        }
        List<com.cn.domain.product> products = product.selectByList(set);
        return products;
    }
}
