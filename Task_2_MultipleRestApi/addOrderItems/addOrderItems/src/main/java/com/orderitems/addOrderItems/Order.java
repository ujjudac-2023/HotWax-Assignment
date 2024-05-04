package com.orderitems.addOrderItems;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private String orderName;
    private Date placedDate;
    private Date approvedDate;
    private String statusId;
    private String partyId;
    private String currencyUomId;
    private String productStoreId;
    private String salesChannelEnumId;
    private double grandTotal;
    private Date completedDate;
    private List<OrderItem> orderItems;
	public Order(String orderId, String orderName, Date placedDate, Date approvedDate, String statusId, String partyId,
			String currencyUomId, String productStoreId, String salesChannelEnumId, double grandTotal,
			Date completedDate, List<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.placedDate = placedDate;
		this.approvedDate = approvedDate;
		this.statusId = statusId;
		this.partyId = partyId;
		this.currencyUomId = currencyUomId;
		this.productStoreId = productStoreId;
		this.salesChannelEnumId = salesChannelEnumId;
		this.grandTotal = grandTotal;
		this.completedDate = completedDate;
		this.orderItems = orderItems;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Date getPlacedDate() {
		return placedDate;
	}
	public void setPlacedDate(Date placedDate) {
		this.placedDate = placedDate;
	}
	public Date getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getCurrencyUomId() {
		return currencyUomId;
	}
	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}
	public String getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}
	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}
	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

    
}
