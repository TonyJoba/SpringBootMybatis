package com.it.sbmt.service.impl;

import com.it.sbmt.dao.OrdersMapper;
import com.it.sbmt.model.Orders;
import com.it.sbmt.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int doadd(Orders orders) {
        return ordersMapper.doadd(orders);
    }

    @Override
    public List<Orders> doselect() {
        return ordersMapper.doselect();
    }


}
