package com.cn.domain;

import java.util.List;

public class product_type {
    private Integer id;

    private String typeName;

    private List<product_category> productCategories;

    public List<product_category> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<product_category> productCategories) {
        this.productCategories = productCategories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    @Override
    public String toString() {
        return "product_type{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", productCategories=" + productCategories +
                '}';
    }
}