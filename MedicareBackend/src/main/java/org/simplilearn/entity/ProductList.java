package org.simplilearn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProductList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productListId;
	private String medicinename;
	private String seller;
	private String qtyDesc;
	private double price;
	private String imgURL;
	private int active=1;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	
	private Date CreationDateTime;
	
	@PrePersist
	private void onCreate() {
		CreationDateTime = new Date(productListId);
	}
	
	public ProductList() {}

	public ProductList(int productListId, String medicinename, String seller, String qtyDesc, double price,
			String imgURL, int active, Date creationDateTime) {
		super();
		this.productListId = productListId;
		this.medicinename = medicinename;
		this.seller = seller;
		this.qtyDesc = qtyDesc;
		this.price = price;
		this.imgURL = imgURL;
		this.active = active;
		CreationDateTime = creationDateTime;
	}

	public int getProductListId() {
		return productListId;
	}

	public void setProductListId(int productListId) {
		this.productListId = productListId;
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

	public String getQtyDesc() {
		return qtyDesc;
	}

	public void setQtyDesc(String qtyDesc) {
		this.qtyDesc = qtyDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}

	
}
