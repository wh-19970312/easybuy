package com.cn.services;

import com.cn.domain.carts;
import com.cn.domain.product;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface cartService {
    boolean insertCart(Integer id, HttpServletRequest request);
    List<carts> selectByUserId(HttpServletRequest request);
}
