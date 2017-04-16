package com.soecode.lyf.entity;

/**
 * 实体
 */
public class Order {

	private int orderId;
	private int userId;
	private int sellerId;
	private int mdId;
	private String orderCreateTime;
	private String orderNumber;
	private String orderTotalPrice;
	private int orderSingleNumber;


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getMdId() {
		return mdId;
	}

	public void setMdId(int mdId) {
		this.mdId = mdId;
	}

	public String getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public int getOrderSingleNumber() {
		return orderSingleNumber;
	}

	public void setOrderSingleNumber(int orderSingleNumber) {
		this.orderSingleNumber = orderSingleNumber;
	}

	@Override
	public String toString() {
		return "Order{}";
	}

	public Order() {
	}
}
