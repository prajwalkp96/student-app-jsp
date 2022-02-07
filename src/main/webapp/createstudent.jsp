<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Student</title>
</head>
<body>
<%@ include file="navbar.jsp" %>

<form action="create" method="post" >

		Name : <input type="text" name="studentName"> <br></br>
		Email : <input type="text" name="email"> <br></br>
		Phone : <input type="number" name="phone"><br></br>
		Gender : <input type="radio" name="gender" value="male">Male<input type="radio" name="gender">Female<br></br>
		Age : <input type="number" name = "age"><br></br>
		
		<input type="submit" value="Create Student">

	</form>
</body>
</html>