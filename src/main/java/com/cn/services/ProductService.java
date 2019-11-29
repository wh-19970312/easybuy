package com.cn.services;

import com.cn.domain.product_type;

import java.util.List;

public interface ProductService {
    List<product_type> findAll();
}
