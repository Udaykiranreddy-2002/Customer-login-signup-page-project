package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.dao.CustomerDAO;
import com.vcube.model.Customer;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
   // private static final long serialVersionUID = 1L;Customer

    public CustomerController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        
        
        // Create a Student object
        Customer s = new Customer();
        s.setFullname(fullname);
        s.setUsername(username);
        s.setPassword(password);

        // Insert the student into the database
        CustomerDAO sd = new CustomerDAO();
        String status = sd.insertStudent(s);
        
        
        if(status.equals("success")) {
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
        }
        else{
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
            }
    }
        
}
