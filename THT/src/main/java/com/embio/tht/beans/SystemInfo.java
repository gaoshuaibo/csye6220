package com.embio.tht.beans;
// Generated Apr 6, 2015 10:54:41 PM by Hibernate Tools 3.4.0.CR1

/**
 * SystemInfo generated by hbm2java
 */
public class SystemInfo implements java.io.Serializable {

	private Integer id;
	private double discount;

	public SystemInfo() {
	}

	public SystemInfo(int id, double discount) {
		this.id = id;
		this.discount = discount;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
