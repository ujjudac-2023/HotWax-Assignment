package com.updaeorder.updateOrder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService = new OrderService();

    @PutMapping("/{orderId}")
    public Order updateOrderName(@PathVariable String orderId, @RequestBody String orderName) {
        return orderService.updateOrderName(orderId, orderName);
    }

    // Other controller methods for fetching orders, creating, updating, deleting orders, etc.
}
