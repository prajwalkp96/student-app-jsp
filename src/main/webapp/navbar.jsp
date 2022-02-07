<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Nav-Bar</title>


<style>

ul {
	list-style-type: none;
	background-color:paleturquoise;
	font-size:20px;
	margin: 10px;
	padding: 10px;
}

li{
	display: inline;
} 

li a
{
    list-style: none;
    display: inline;
    /* text-align: center; */
    padding: 5px 10px;
}

</style>
</head>

<body>
<ul>
<li><a href="createstudent.jsp">CREATE</a></li>
<li><a href="display">DISPLAY</a></li>
<li><a href="logout">LOGOUT</a></li>
</ul>


</body>
</html>