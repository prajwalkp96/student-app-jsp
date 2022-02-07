package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;


public class DeleteStudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		String id = req.getParameter("id");
		int parseId = Integer.parseInt(id);

		StudentDao dao = new StudentDao();

		boolean result = dao.deleteStudent(parseId);

		if (result == true) {
			printWriter.print("<html><body><h1>Data is deleted</h1></body></html>");
		} else {
			printWriter.print("<html><body><h1>Data is not deleted</h1></body></html>");
		}
	}
}
