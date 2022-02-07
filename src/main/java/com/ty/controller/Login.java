package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dao.UserDao;
import com.ty.dto.User;

public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter pout=resp.getWriter();

		UserDao dao = new UserDao();
		User user = dao.validateUser(email, password);
		
		if(user != null) {
			
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("email", user.getMail());
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("navbar.jsp");
			dispatcher.forward(req, resp);

		} else {

			pout.print("<h1>Invalid Email or Password</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, resp);

		}
	}

}
