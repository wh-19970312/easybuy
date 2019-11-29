package com.cn;

import com.cn.dao.newsMapper;
import com.cn.dao.product_typeMapper;
import com.cn.domain.news;
import com.cn.domain.product_type;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
}
