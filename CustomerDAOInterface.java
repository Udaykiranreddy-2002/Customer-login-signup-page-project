package com.vcube.dao;


import com.vcube.model.Customer;
import com.vcube.model.LoginModel;


public interface CustomerDAOInterface {
	
	public String insertStudent(Customer s);
	public String selectStudent(LoginModel lm);
	public String updateCustomer(Customer s);
	public String deleteCustomer(LoginModel lm);

	

}
