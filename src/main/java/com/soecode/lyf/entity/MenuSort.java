package com.soecode.lyf.entity;

/**
 * 实体
 */
public class MenuSort {

	private long msId;
	private String msName;

	public long getMsId() {
		return msId;
	}

	public void setMsId(long msId) {
		this.msId = msId;
	}

	public String getMsName() {
		return msName;
	}

	public void setMsName(String msName) {
		this.msName = msName;
	}

	@Override
	public String toString() {
		return "MenuSort{}";
	}

	public MenuSort() {
	}
}
