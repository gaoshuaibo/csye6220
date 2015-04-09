package com.embio.tht.beans;
// Generated Apr 6, 2015 10:54:41 PM by Hibernate Tools 3.4.0.CR1



/**
 * Payment generated by hbm2java
 */
public class Payment implements java.io.Serializable {

	private Integer id;
	private Double balance;
	private String status;
	private Integer orderId;
	private Double discount;
	private Integer isOnline;

	public Payment() {
	}

	public Payment(int id) {
		this.id = id;
	}

	public Payment(int id, Double balance, String status, Integer orderId,
			Double discount, Integer isOnline) {
		this.id = id;
		this.balance = balance;
		this.status = status;
		this.orderId = orderId;
		this.discount = discount;
		this.isOnline = isOnline;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}

}
