package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.dao.CustomerDAO;
import com.vcube.model.LoginModel;


@WebServlet("/Delete")
public class Delete extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Use LoginModel to store credentials
        LoginModel lm = new LoginModel();
        lm.setUsername(username);
        lm.setPassword(password);

        CustomerDAO dao = new CustomerDAO();
        String status = dao.deleteCustomer(lm);

        if (status.equals("success")) {
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("delete.jsp");
            view.forward(request, response);
        }
    }
}
