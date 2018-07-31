package com.it.sbmt.dao;

import com.it.sbmt.model.Orders;

import java.util.List;

public interface OrdersMapper {
    public int doadd(Orders orders);

    public List<Orders> doselect();
}
