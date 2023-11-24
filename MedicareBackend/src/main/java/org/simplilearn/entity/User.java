package org.simplilearn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;
	private int age;
	private String name;
	private String email;
	private String gender;
	private String address;
	private String mobile;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "USER_PRODUCT_TABLE", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "UserId") }, inverseJoinColumns = {
					@JoinColumn(name = "product_id", referencedColumnName = "pid") })
	private List<Product> products;

	public User() {
	}

	public User(int age, String name, String email, String gender, String address, String mobile,
			List<Product> products) {
		super();
		// UserId = userId;
		this.age = age;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.mobile = mobile;
		this.products = products;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", age=" + age + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", address=" + address + ", mobile=" + mobile + ", products=" + products + "]";
	}

}