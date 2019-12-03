package com.cn.services.Impl;

import com.cn.dao.productMapper;
import com.cn.dao.product_typeMapper;
import com.cn.domain.product;
import com.cn.domain.product_type;
import com.cn.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements ProductService {
    @Autowired
    private product_typeMapper mapper;
    @Autowired
    private productMapper product;

    @Override
    public List<product_type> findAll() {
        return mapper.findType();
    }

    @Override
    public List<product> selectProduct(Integer id) {
        return product.selectBylevalId(id);
    }

    @Override
    public List<com.cn.domain.product> selectAll() {
        return product.selectByAll();
    }
}
