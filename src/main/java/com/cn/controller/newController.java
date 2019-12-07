package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.domain.news;
import com.cn.services.newService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/news")
public class newController {
    @Autowired
    newService service;
    @ResponseBody
    @RequestMapping(value = "/findNews")
    public String findAllNews(){
        List<news> news = service.allNews();
        String json = JSON.toJSONString(news);
        return json;
    }
}
