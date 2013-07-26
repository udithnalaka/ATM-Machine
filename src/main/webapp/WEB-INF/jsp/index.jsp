<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATM Machine</title>
</head>
<body>
	<h2>ATM Machine!</h2>
	<br><br>
	${message} <br>
	<p>
		<a href="${pageContext.request.contextPath}/customer/add.htm">Add New Customer</a> <br>
		<a href="${pageContext.request.contextPath}/customer/list.htm">List All Customers</a>

	</p>
</body>
</html>
