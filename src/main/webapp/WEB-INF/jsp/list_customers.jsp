<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATM Machine</title>
</head>
<body>
	<h2>Customer List</h2>
	<br><br>
	<p><a href="${pageContext.request.contextPath}/index.htm">Home page</a></p>
	<br><br>
	
	<c:if test="${!empty customerList}">
		<table border=1>
			<thead> <tr>  
				<th> Customer Name </th>
				<th> Customer PIN </th>
				<th> &nbsp; </th>
			</tr></thead>
			<tbody>
				<c:forEach items="#{customerList}" var="customer">
					<tr> 
						<td width="100px">${customer.cust_name}</td>
       			 		<td width="250px">${customer.cust_pin}</td>
       			 		<td width="200px">
				            <a href="${pageContext.request.contextPath}/customer/edit/${customer.id}.html">Edit </a>
				            <a href="${pageContext.request.contextPath}/customer/delete/${customer.id}.html" onclick="return confirm('Are you sure you want to delete this customer?')"> Delete </a>
				        </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	
</body>
</html>