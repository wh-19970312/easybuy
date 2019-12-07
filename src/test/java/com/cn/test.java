package com.cn;

import com.cn.dao.cartsMapper;
import com.cn.dao.newsMapper;
import com.cn.dao.productMapper;
import com.cn.dao.product_typeMapper;
import com.cn.domain.carts;
import com.cn.domain.news;
import com.cn.domain.product;
import com.cn.domain.product_type;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com//cn//spring//applicationContext-dao.xml");
        product_typeMapper bean = context.getBean(product_typeMapper.class);
        product_type product_type = bean.selectByPrimaryKey(1);
        System.out.println(product_type);
    }
    @Test
    public  void  practice(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com//cn//spring//applicationContext-dao.xml");
        newsMapper bean = context.getBean(newsMapper.class);
        List<news> all = bean.findAll();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }
    @Test
    public  void  carts(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com//cn//spring//applicationContext-dao.xml");
        cartsMapper bean = context.getBean(cartsMapper.class);
        carts carts = bean.selectByPrimaryKey(1);
        System.out.println(carts);

    }
    @Test
    public  void SetTest(){
        Set set=new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public  void  TestLiist(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com//cn//spring//applicationContext-dao.xml");
        productMapper bean = context.getBean(productMapper.class);
        Set set=new HashSet<String>();
        set.add(733);
        set.add(734);
        set.add(736);

        List<product> list1 = bean.selectByList(set);
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }



    }
}
