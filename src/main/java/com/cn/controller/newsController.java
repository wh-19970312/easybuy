package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.domain.*;
import com.cn.services.newService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class newsController  {
    @Autowired
    newService service;
    @ResponseBody
    @RequestMapping(value = "/findNews")
    public String findAllNews(){
        List<news> news = service.allNews();
        String json = JSON.toJSONString(news);
        return json;
    }

    @RequestMapping(value = "findnews")
    public String findAllNew(HttpServletRequest request){

        List<news> news = service.allNews();
        HttpSession session=request.getSession();
        session.setAttribute("newsList",news);
        return  "shownews";
    }

    @RequestMapping("/findusers")
    public String findusers(HttpServletRequest request){
        List<user> userList=service.selectall();
        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).getAddress());
        }
        HttpSession session=request.getSession();
        session.setAttribute("userList",userList);
        return "showusers";
    }

    @RequestMapping("deleteuser")
    public String deleteuser(int id,HttpServletRequest request){
        service.deleteByPrimaryKey(id);
        return  findusers(request);
    }

    @RequestMapping("changeuser")
    public String changeuser(user user,HttpServletRequest request){
        System.out.println(user.getSex());
        System.out.println(user.getId());
        System.out.println(user.getAddress());
        service.updateByPrimaryKeySelective(user);
        user_address userAddress=new user_address();
        userAddress.setAddress(user.getAddress());
        userAddress.setUserid(user.getId());
        service.updateByPrimaryKeySelective(userAddress);
        return  findusers(request);
    }

    @RequestMapping("insertuser")
    public String insertuser(user user,HttpServletRequest request){
        System.out.println(user.getSex());
        System.out.println(user.getId());
        System.out.println(user.getAddress());

        service.insertuser(user);
        int id=service.selectbyidcard(user.getIdentitycode()).getId();
        user_address userAddress=new user_address();
        userAddress.setAddress(user.getAddress());
        userAddress.setUserid(id);
        service.insertuseraddress(userAddress);
        return  findusers(request);
    }

    @RequestMapping("findorders")
    public String findorders(HttpServletRequest request){
        List<order> orderList=service.selectallorders();
        HttpSession session=request.getSession();
        session.setAttribute("orderList",orderList);
        return  "showallorders";
    }

    @RequestMapping("selectorderby")
    public String selectorderby(HttpServletRequest request,order order){
        System.out.println(order.getUsername()+"sssss");
        List<order> orderList=service.selectorderby(order);
        HttpSession session=request.getSession();
        session.setAttribute("orderList",orderList);
        return  "showallorders";
    }

    @RequestMapping("changeorder")
    public String updateByPrimaryKeySelective(order record,HttpServletRequest res){
        service.updateByPrimaryKeySelective(record);
        return findorders(res);
    }

    @RequestMapping("deleteorder")
    public String deleteorder(int id,HttpServletRequest res){
        service.deleteorderByPrimaryKey(id);
        return findorders(res);
    }

    @RequestMapping("changenews")
    public String changenews(news news,HttpServletRequest res){
        service.updateByPrimaryKeynews(news);
        return findAllNew(res);
    }

    @RequestMapping("deletenews")
    public String deletenews(int id,HttpServletRequest res){
        service.deleteByPrimaryKeynews(id);
        return findAllNew(res);
    }

    @RequestMapping("findadvise")
    public String findadvise(HttpServletRequest request){
        List<note> noteList= service.findallnotes();
        HttpSession session=request.getSession();
        session.setAttribute("noteList",noteList);
        return "shownote";
    }

    @RequestMapping("updatenotes")
    public String updatenotes(HttpServletRequest request,note note){
        service.updatenotes(note);

        return findadvise(request);
    }


}
