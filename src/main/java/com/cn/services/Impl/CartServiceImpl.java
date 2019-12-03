package com.cn.services.Impl;

import com.cn.dao.orderMapper;
import com.cn.dao.userMapper;
import com.cn.services.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class CartServiceImpl implements cartService {
    @Autowired
   private   orderMapper order;
    @Autowired
    private userMapper user;
     @Override
    public void insertCart(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer id1 = (Integer) session.getAttribute("id");
        Date date = new Date();



     }


}
