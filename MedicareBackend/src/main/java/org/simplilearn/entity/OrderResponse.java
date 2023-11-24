package org.simplilearn.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_DEFAULT)

public class OrderResponse {

	private int UserId;
	private String name;
	private String email;
	private String mobile;
	private String address;
	private String medicinename;
	private String seller;
	private double price;
	private int quantity;
	private Date orderDateTime;
	
	public OrderResponse() {}

	public OrderResponse(int userId, String name, String email, String mobile, String address, String medicinename,
			String seller, double price, int quantity, Date orderDateTime) {
		super();
		UserId = userId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.medicinename = medicinename;
		this.seller = seller;
		this.price = price;
		this.quantity = quantity;
		this.orderDateTime = orderDateTime;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String contactno) {
		this.mobile = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	
	
}
