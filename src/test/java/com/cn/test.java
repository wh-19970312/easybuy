package com.cn;

import com.cn.dao.product_typeMapper;
import com.cn.domain.product_type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com//cn//spring//applicationContext-dao.xml");
        product_typeMapper bean = context.getBean(product_typeMapper.class);
        product_type product_type = bean.selectByPrimaryKey(1);
        System.out.println(product_type);
    }
}
