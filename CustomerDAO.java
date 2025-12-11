package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vcube.model.Customer;
import com.vcube.model.LoginModel;


public class CustomerDAO implements CustomerDAOInterface {
	String status ="failure";
	
    public String insertStudent(Customer s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Customer (fullname,username,password) VALUES (?, ?, ?)");
            
            ps.setString(1, s.getFullname());
            ps.setString(2, s.getUsername());
            ps.setString(3, s.getPassword());

            int n = ps.executeUpdate();
            if (n > 0) {
                status = "success";
            } 
        }
        catch (Exception e) {
            System.out.println(e); // Print exception details
        }
        return status;
    }
    
    public String selectStudent(LoginModel lm){
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from Customer where username=? and password=?");
            ps.setString(1, lm.getUsername());
            ps.setString(2, lm.getPassword());
            ResultSet rs = ps.executeQuery();
            int count=0;
            while (rs.next()) {
            	count++;
            } 
            if(count>0) {
                status = "success";
            }
        }
        catch (Exception e) {
            System.out.println(e); // Print exception details
        }
        return status;
    }

	@Override
	public String updateCustomer(Customer s) {
		try {
   		 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            PreparedStatement ps = con.prepareStatement("update Customer set fullname=?, username=?, password=? where fullname=?");
            
            ps.setString(1, s.getFullname());
            ps.setString(2, s.getUsername());
            ps.setString(3, s.getPassword());
            ps.setString(4, s.getFullname());
            
            int n=ps.executeUpdate();
            if(n>0) {
           	 status = "success";
            }
   	}catch (Exception e) {
           System.out.println(e); 
       }
		return status;
	}

	@Override
	public String deleteCustomer(LoginModel lm) {
	    String status = "failure";
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/jdbc", "root", "root"
	        );

	        PreparedStatement ps = con.prepareStatement(
	            "DELETE FROM Customer WHERE username=? AND password=?"
	        );

	        ps.setString(1, lm.getUsername());
	        ps.setString(2, lm.getPassword());

	        int n = ps.executeUpdate();

	        if (n > 0) {
	            status = "success";
	        }
	        
	    } catch (Exception e) {
	        System.out.println(e);
	    }

	    return status;
	}

}
