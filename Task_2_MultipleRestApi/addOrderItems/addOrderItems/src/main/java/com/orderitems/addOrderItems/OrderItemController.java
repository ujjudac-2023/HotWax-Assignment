package com.orderitems.addOrderItems;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderItems")
public class OrderItemController {
    private OrderItemService orderItemService = new OrderItemService();

    @PostMapping("/create")
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.saveOrderItem(orderItem);
    }

}
