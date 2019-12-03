package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.domain.product;
import com.cn.domain.product_type;
import com.cn.services.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/productType")
public class productTypeController {
    @Autowired
    private ProductService service;
    @RequestMapping("/all")
    @ResponseBody
    public String selectAllType(){
        List<product_type> all = service.findAll();
        String json = JSON.toJSONString(all);
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "/AllProduct")
    public String product(){
        List<product> products = service.selectAll();
        String json = JSON.toJSONString(products);
        return  json;
    }

    @ResponseBody
    @RequestMapping(value = "/leval3")
    public String selectProduct(@RequestParam(required = false) Integer id ){
        List<product> products = service.selectProduct(id);
        String json = JSON.toJSONString(products);
        return json;
    }


}
