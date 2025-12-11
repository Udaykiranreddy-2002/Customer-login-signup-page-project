package com.vcube.model;

public class LoginModel {
	
	private String username;
	private String password;
	
	public LoginModel() {}
	public LoginModel(String un,String pws) {
		this.username=un;
		this.password=pws;
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
	public String toString() {
		return username;
	}
	

}
