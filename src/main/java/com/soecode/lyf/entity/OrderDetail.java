package com.soecode.lyf.entity;

import java.util.List;

/**
 * 实体
 */
public class OrderDetail {

	private int userId;
	private int mdId;
	private int orderSingleNumber;
	private String orderNumber;
	private String mdName;
	private String mdNowprice;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMdId() {
		return mdId;
	}

	public void setMdId(int mdId) {
		this.mdId = mdId;
	}

	public int getOrderSingleNumber() {
		return orderSingleNumber;
	}

	public void setOrderSingleNumber(int orderSingleNumber) {
		this.orderSingleNumber = orderSingleNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getMdName() {
		return mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	public String getMdNowprice() {
		return mdNowprice;
	}

	public void setMdNowprice(String mdNowprice) {
		this.mdNowprice = mdNowprice;
	}

	@Override
	public String toString() {
		return "OrderDetail{}";
	}

	public OrderDetail() {
	}
}
