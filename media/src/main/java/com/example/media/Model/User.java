package com.example.media.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private ObjectId id;
	public String getId() {
		return id.toHexString();
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	private String password;
	private int role;
	@Override
	public String toString() {
		return "User [password=" + password + ", role=" + role + ", username=" + username + "]";
	}
	private String username;
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}

	
	
}
