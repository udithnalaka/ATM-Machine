<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATM Machine</title>
</head>
<body>
	<h2>Add New Customer</h2>
	<br><br>
	<p><a href="${pageContext.request.contextPath}/index.htm">Home page</a></p>
	
	<form:form method="POST" modelAttribute="customer" action="${pageContext.request.contextPath}/customer/add/submit.htm">
		<table>
		  <tbody>
		  	<tr>
				<td><form:label path="cust_id">Customer Number:</form:label></td>
				<td><form:input path="cust_id"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="cust_name">Customer Name:</form:label></td>
				<td><form:input path="cust_name"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="cust_pin">enter PIN number:</form:label></td>
				<td><form:input path="cust_pin"></form:input></td>
			</tr>			
			<tr>
				<td><input value="Add Customer" type="submit"></td>
				<td></td>
			</tr>
		  </tbody>
		</table>
</form:form>
	
</body>
</html>