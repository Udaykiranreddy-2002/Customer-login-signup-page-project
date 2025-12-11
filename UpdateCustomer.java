package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.dao.CustomerDAO;
import com.vcube.model.Customer;

@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        

        Customer s = new Customer();
        s.setFullname(fullname);
        s.setUsername(username);
        s.setPassword(password);

        CustomerDAO sd = new CustomerDAO();
        String status = sd.updateCustomer(s);

        if(status.equals("success")) {
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("update.jsp");
            view.forward(request, response);
        }
    }
}

