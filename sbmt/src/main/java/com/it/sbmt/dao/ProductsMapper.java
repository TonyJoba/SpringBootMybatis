package com.it.sbmt.dao;

import com.it.sbmt.model.Products;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductsMapper {

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
