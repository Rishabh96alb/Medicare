package org.simplilearn.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UsersId;
	private String username;
	private String password;
	
	public UserDetails() {}

	public UserDetails(int usersId, String username, String password) {
		super();
		UsersId = usersId;
		this.username = username;
		this.password = password;
	}

	public int getUsersId() {
		return UsersId;
	}

	public void setUsersId(int usersId) {
		UsersId = usersId;
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
		return "UserDetails [UsersId=" + UsersId + ", username=" + username + ", password=" + password + "]";
	}

}