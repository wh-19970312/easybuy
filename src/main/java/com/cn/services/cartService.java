package com.cn.services;

import javax.servlet.http.HttpServletRequest;

public interface cartService {
    void insertCart(Integer id, HttpServletRequest request);
}
