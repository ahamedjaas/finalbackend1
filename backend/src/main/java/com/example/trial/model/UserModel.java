package com.example.trial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")
public class UserModel {
	
	
	public UserModel() {
		super();
	}
	
	
	public UserModel(int id, String email, String password, String username, String mobilenumber, String userrole) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobilenumber = mobilenumber;
		this.userrole = userrole;
	}
	@Id
	private int id;
	private String email;
	private String password;
	private String username;
	private String mobilenumber;
	private String userrole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	

}
