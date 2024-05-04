package com.person.order.controller;
import org.springframework.web.bind.annotation.*;

import com.person.order.entity.Order;
import com.person.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService = new OrderService();

    @PostMapping("/create")
    public String createOrder(@RequestBody Order order) {
        return orderService.processOrder(order);
    }

}
