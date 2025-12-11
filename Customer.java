package com.vcube.model;

public class Customer {
		private String username;
		private String fullname;
		private String password;
		
		public Customer() {}
		public Customer(String un,String fn,String pws) {
			this.username=un;
			this.fullname=fn;
			this.password=pws;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String toString() {
			return username + ":"+fullname;
		}
		
}
