package com.updaeorder.updateOrder;
import java.util.Date;

public class Order {
    private String orderId;
    private String orderName;
    private String currencyUomId;
    private String salesChannelEnumId;
    private String statusId;
    private String productStoreId;
    private Date placedDate;
    private Date approvedDate;
    private double grandTotal;
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
	public String getCurrencyUomId() {
		return currencyUomId;
	}
	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}
	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}
	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
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
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", currencyUomId=" + currencyUomId
				+ ", salesChannelEnumId=" + salesChannelEnumId + ", statusId=" + statusId + ", productStoreId="
				+ productStoreId + ", placedDate=" + placedDate + ", approvedDate=" + approvedDate + ", grandTotal="
				+ grandTotal + "]";
	}
	
	public Order(String orderId, String orderName, String currencyUomId, String salesChannelEnumId, String statusId,
			String productStoreId, Date placedDate, Date approvedDate, double grandTotal) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.currencyUomId = currencyUomId;
		this.salesChannelEnumId = salesChannelEnumId;
		this.statusId = statusId;
		this.productStoreId = productStoreId;
		this.placedDate = placedDate;
		this.approvedDate = approvedDate;
		this.grandTotal = grandTotal;
	}

    
}
