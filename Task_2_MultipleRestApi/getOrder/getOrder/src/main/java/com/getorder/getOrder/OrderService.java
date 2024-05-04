package com.getorder.getOrder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderService {
    public Order getOrderById(String orderId) {
        // Mock data for demonstration
        Order order = new Order();
        order.setOrderId(orderId);
        order.setOrderName("Order123");
        order.setPlacedDate(new Date());
        order.setApprovedDate(new Date());
        order.setStatusId("PROCESSING");
        order.setPartyId("P10001");
        order.setCurrencyUomId("USD");
        order.setProductStoreId("Store123");
        order.setSalesChannelEnumId("ONLINE");
        order.setGrandTotal(150);
        order.setCompletedDate(new Date());

        List<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem1 = new OrderItem();
        orderItem1.setOrderItemSeqId(1);
        orderItem1.setProductId("PD1001");
        orderItem1.setItemDescription("Product A");
        orderItem1.setQuantity(2);
        orderItem1.setUnitAmount(50);
        orderItem1.setItemTypeEnumId("PHYSICAL");
        orderItems.add(orderItem1);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setOrderItemSeqId(2);
        orderItem2.setProductId("PD1002");
        orderItem2.setItemDescription("Product B");
        orderItem2.setQuantity(1);
        orderItem2.setUnitAmount(30);
        orderItem2.setItemTypeEnumId("DIGITAL");
        orderItems.add(orderItem2);

        order.setOrderItems(orderItems);

        return order;
    }
}
