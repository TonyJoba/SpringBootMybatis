package com.it.sbmt.service;

import com.it.sbmt.model.Products;

import java.util.List;

public interface ProductsService {

    /**
     * 定义查询所有商品的方法
     */
    public List<Products> getAllProducts();

    /**
     * 定义根据id查询所有商品的方法
     */
    public List<Products> getProductsById(Integer productsId);

    public int updateDeleteCounts(Integer productsId);
}
