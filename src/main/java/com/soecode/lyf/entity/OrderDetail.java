package com.soecode.lyf.entity;

import java.util.List;

/**
 * 实体
 */
public class OrderDetail {

	private long mdId;
	private long userId;

	public long getMdId() {
		return mdId;
	}

	public void setMdId(long mdId) {
		this.mdId = mdId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "OrderDetail{" +
				"mdId=" + mdId +
				", userId=" + userId +
				'}';
	}
}
