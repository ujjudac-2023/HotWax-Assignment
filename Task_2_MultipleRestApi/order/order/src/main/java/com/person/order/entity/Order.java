package com.person.order.entity;
import java.util.Date;

public class Order {
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
    private String orderId; // To store the generated order ID

    // Constructors
    public Order() {
        // Default constructor
    }

    public Order(String orderName, Date placedDate, Date approvedDate, String statusId, String partyId,
                 String currencyUomId, String productStoreId, String salesChannelEnumId, double grandTotal,
                 Date completedDate) {
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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", placedDate=" + placedDate + ", approvedDate=" + approvedDate
				+ ", statusId=" + statusId + ", partyId=" + partyId + ", currencyUomId=" + currencyUomId
				+ ", productStoreId=" + productStoreId + ", salesChannelEnumId=" + salesChannelEnumId + ", grandTotal="
				+ grandTotal + ", completedDate=" + completedDate + ", orderId=" + orderId + "]";
	}

  
}
