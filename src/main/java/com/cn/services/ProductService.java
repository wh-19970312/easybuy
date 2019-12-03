package com.cn.services;

import com.cn.domain.product;
import com.cn.domain.product_type;

import java.util.List;

public interface ProductService {
    List<product_type> findAll();
    List<product> selectProduct(Integer id);
    List<product> selectAll();
    product selectById(Integer id);
}
