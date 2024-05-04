package com.updaeorder.updateOrder;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order updateOrderName(String orderId, String newOrderName) {
        // Fetch order by orderId
        Order order = getOrderById(orderId);
        
        // If order is found, update its name
        if (order != null) {
            order.setOrderName(newOrderName);
        }

        return order;
    }

    // Method to fetch order by ID (Mock implementation for demonstration)
    private Order getOrderById(String orderId) {
        // Replace this with actual logic to fetch order from a database
        return new Order(
                orderId,
                "Sample Order",
                "USD",
                "ONLINE",
                "OrderPlaced",
                "Store123",
                new Date(),
                new Date(),
                54.97
        );
    }
}
