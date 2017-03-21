package com.soecode.lyf.entity;

/**
 * 图书实体
 */
public class User {

	private long userId;//

	private String userName;//

	private String userPwd;//
	private String userTel;//
	private String userAdr;//
	private String userType;//
	private String userSellerName;//

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAdr() {
		return userAdr;
	}

	public void setUserAdr(String userAdr) {
		this.userAdr = userAdr;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserSellerName() {
		return userSellerName;
	}

	public void setUserSellerName(String userSellerName) {
		this.userSellerName = userSellerName;
	}

	public User() {
	}

	@Override
	public String toString() {
		return getUserName();
	}
}
