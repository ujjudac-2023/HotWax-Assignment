package com.allorders.getAllOrders;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderService {
    public List<Order> getAllOrders() {
        // Mock data for demonstration
        List<Order> orders = new ArrayList<>();

        // Create some sample orders
        Order order1 = new Order();
        order1.setOrderId("ORD1001");
        order1.setOrderName("Order123");
        order1.setPlacedDate(new Date());
        order1.setApprovedDate(new Date());
        order1.setStatusId("PROCESSING");
        order1.setPartyId("P10001");
        order1.setCurrencyUomId("USD");
        order1.setProductStoreId("Store123");
        order1.setSalesChannelEnumId("ONLINE");
        order1.setGrandTotal(150);
        order1.setCompletedDate(new Date());

        List<OrderItem> orderItems1 = new ArrayList<>();
        OrderItem orderItem1 = new OrderItem();
        orderItem1.setOrderItemSeqId(1);
        orderItem1.setProductId("PD1001");
        orderItem1.setItemDescription("Product A");
        orderItem1.setQuantity(2);
        orderItem1.setUnitAmount(50);
        orderItem1.setItemTypeEnumId("PHYSICAL");
        orderItems1.add(orderItem1);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setOrderItemSeqId(2);
        orderItem2.setProductId("PD1002");
        orderItem2.setItemDescription("Product B");
        orderItem2.setQuantity(1);
        orderItem2.setUnitAmount(30);
        orderItem2.setItemTypeEnumId("DIGITAL");
        orderItems1.add(orderItem2);

        order1.setOrderItems(orderItems1);

        orders.add(order1);

        // Return the list of orders
        return orders;
    }
}
