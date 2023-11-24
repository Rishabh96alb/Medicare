package org.simplilearn.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String medicinename;
	private String seller;
	private double price;
	private int quantity;
	
	@ManyToMany(mappedBy="products", fetch=FetchType.LAZY)
	@JsonBackReference
	private List<User> users;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date orderDateTime;
	
	@PrePersist
	private void onCreate() {
		orderDateTime = new Date();
	}
	
	public Product() {}

	public Product(int pid, String medicinename, String seller, double price, int quantity, List<User> users,
			Date orderDateTime) {
		super();
		this.pid = pid;
		this.medicinename = medicinename;
		this.seller = seller;
		this.price = price;
		this.quantity = quantity;
		this.users = users;
		this.orderDateTime = orderDateTime;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	
	
	
}
