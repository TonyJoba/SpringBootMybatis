package com.it.sbmt.service.impl;

import com.it.sbmt.dao.ProductsMapper;
import com.it.sbmt.model.Products;
import com.it.sbmt.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsMapper productsMapper;

    @Override
    public List<Products> getAllProducts() {
        return productsMapper.getAllProducts();
    }

    @Override
    public List<Products> getProductsById(Integer productsId) {
        return productsMapper.getProductsById(productsId);
    }

    @Override
    public int updateDeleteCounts(Integer productsId) {
        return productsMapper.updateDeleteCounts(productsId);
    }
}
