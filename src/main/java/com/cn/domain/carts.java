package com.cn.domain;

import java.util.Date;

public class carts {
    private Integer id;

    private Integer userid;

    private Integer productid;

    private String ordernumber;

    private Date createtime;

    private Integer isdelete;

    private product product;

    public com.cn.domain.product getProduct() {
        return product;
    }

    public void setProduct(com.cn.domain.product product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "carts{" +
                "id=" + id +
                ", userid=" + userid +
                ", productid=" + productid +
                ", ordernumber='" + ordernumber + '\'' +
                ", createtime=" + createtime +
                ", isdelete=" + isdelete +
                ", product=" + product +
                '}';
    }
}