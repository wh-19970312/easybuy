package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.domain.carts;
import com.cn.services.cartService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/cart")
public class cartController {
    @Autowired
    cartService service;
    @RequestMapping(value = "/insert")
    public void insertCart(@RequestParam(required = false) Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean flag = service.insertCart(id, request);
        if(flag==true){
            response.sendRedirect("Cart.html?msg=true");
        }else {
            response.sendRedirect("Cart.html?msg=false");
        }
    }
    @ResponseBody
    @RequestMapping(value = "/findByUserId")
    public String selectCartsByUserId(HttpServletRequest request){
        List<carts> carts = service.selectByUserId(request);
        String json = JSON.toJSONString(carts);
        return json;
    }
}
