package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class CreateStudentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student = new Student();
		String name = req.getParameter("studentName");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		
		student.setName(name);
		student.setEmail(email);
		student.setAge(Integer.parseInt(age));
		student.setGender(gender);
		student.setPhone(Long.parseLong(phone));
		
		StudentDao dao = new StudentDao();
		dao.saveStudent(student);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1>Student created</h1></body></html>");

//		RequestDispatcher dispatcher = req.getRequestDispatcher("createstudent.jsp");
//		dispatcher.include(req, resp);
	}
}
