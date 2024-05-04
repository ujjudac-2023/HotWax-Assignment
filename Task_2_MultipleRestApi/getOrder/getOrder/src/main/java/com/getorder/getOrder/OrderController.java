package com.getorder.getOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService = new OrderService();

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable String orderId) {
        return orderService.getOrderById(orderId);
    }

}
