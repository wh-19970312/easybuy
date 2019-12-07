package com.cn.services.Impl;


import com.cn.dao.cartsMapper;
import com.cn.dao.orderMapper;
import com.cn.dao.userMapper;
import com.cn.domain.carts;
import com.cn.domain.product;
import com.cn.services.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;


@Service
public class CartServiceImpl implements cartService {
    @Autowired
    private cartsMapper mapper;
    @Override
    public boolean insertCart(Integer id, HttpServletRequest request) {
        boolean flag=true;
        HttpSession session = request.getSession();
        Integer UserId = (Integer) session.getAttribute("id");
        List<carts> carts1 = mapper.selectByUserId(UserId);
        for (int i = 0; i < carts1.size(); i++) {
            if(carts1.get(i).getProductid()==id){
                flag=false;
                break;
            }
        }
        if(flag==true){
            String replace = UUID.randomUUID().toString().replace("-", "");
            carts carts = new carts();
            carts.setUserid(UserId);
            carts.setProductid(id);
            carts.setOrdernumber(replace);
            mapper.insert(carts);
        }
       return flag;
    }

    @Override
    public List<carts> selectByUserId(HttpServletRequest request) {
        Integer id = (Integer) request.getSession().getAttribute("id");
        List<carts> carts = mapper.selectByUserId(id);
        return carts;
    }
}
