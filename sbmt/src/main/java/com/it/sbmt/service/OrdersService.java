package com.it.sbmt.service;

import com.it.sbmt.model.Orders;

import java.util.List;

public interface OrdersService {

    public int doadd(Orders orders);

    public List<Orders> doselect();
}

