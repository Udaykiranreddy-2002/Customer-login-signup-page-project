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

@WebServlet("/LogintController")
public class LogintController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginModel lm= new LoginModel();
		lm.setUsername(username);
		lm.setPassword(password);
		
		CustomerDAO sd = new CustomerDAO();
		String status = sd.selectStudent(lm);
		
		if(status.equals("success")) {
	        RequestDispatcher view = request.getRequestDispatcher("home.jsp");
	        view.forward(request, response);
	    }else {
	        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		    view.forward(request, response);
	    }
		
	}

}
