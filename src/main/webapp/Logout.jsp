<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String email = (String)session.getAttribute("email"); 
	if(email == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<%@ include file="navbar.jsp" %>
	<h1>ENTER THE USER DATA</h1>
</body>
</html>