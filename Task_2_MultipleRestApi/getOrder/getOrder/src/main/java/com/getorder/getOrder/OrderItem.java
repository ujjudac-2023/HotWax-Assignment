package com.getorder.getOrder;

public class OrderItem {
    private int orderItemSeqId;
    private String productId;
    private String itemDescription;
    private int quantity;
    private double unitAmount;
    private String itemTypeEnumId;
	public int getOrderItemSeqId() {
		return orderItemSeqId;
	}
	public void setOrderItemSeqId(int orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(double unitAmount) {
		this.unitAmount = unitAmount;
	}
	public String getItemTypeEnumId() {
		return itemTypeEnumId;
	}
	public void setItemTypeEnumId(String itemTypeEnumId) {
		this.itemTypeEnumId = itemTypeEnumId;
	}
	public OrderItem(int orderItemSeqId, String productId, String itemDescription, int quantity, double unitAmount,
			String itemTypeEnumId) {
		super();
		this.orderItemSeqId = orderItemSeqId;
		this.productId = productId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.unitAmount = unitAmount;
		this.itemTypeEnumId = itemTypeEnumId;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderItem [orderItemSeqId=" + orderItemSeqId + ", productId=" + productId + ", itemDescription="
				+ itemDescription + ", quantity=" + quantity + ", unitAmount=" + unitAmount + ", itemTypeEnumId="
				+ itemTypeEnumId + "]";
	}
    

 }
