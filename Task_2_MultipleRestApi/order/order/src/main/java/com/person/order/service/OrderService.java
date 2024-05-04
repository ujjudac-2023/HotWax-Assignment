package com.person.order.service;
import java.util.UUID;

import com.person.order.entity.Order;

public class OrderService {
    public String generateOrderId() {
        return UUID.randomUUID().toString();
    }

    public String processOrder(Order order) {
       order.setOrderId(generateOrderId());
        return "OrderId is "+order.getOrderId();
    }
}
