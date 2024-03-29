package org.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AdminId;
	private String username;
	private String password;
	
	public AdminDetails()
	{
		
	}

	public AdminDetails(int adminId, String username, String password) {
		super();
		AdminId = adminId;
		this.username = username;
		this.password = password;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDetails [AdminId=" + AdminId + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
