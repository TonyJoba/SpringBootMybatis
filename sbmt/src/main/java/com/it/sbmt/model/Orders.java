package com.it.sbmt.model;

import java.util.List;

public class Orders {

    private Integer orderId;
    private String orderNum;
    private Integer orderDetails;

    private String productsName;//商品的名字
    public String getProductsName() {
        return productsName;
    }
    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }
    private Integer productsPrice;//商品价格
    public Integer getProductsPrice() {
        return productsPrice;
    }
    public void setProductsPrice(Integer productsPrice) {
        this.productsPrice = productsPrice;
    }

    //每个订单号下面都会有多个商品,此处留用于多个商品的添加，生成一个订单的情况
    List<Products> products ;
    public List<Products> getProducts() {
        return products;
    }
    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Integer orderDetails) {
        this.orderDetails = orderDetails;
    }
}
