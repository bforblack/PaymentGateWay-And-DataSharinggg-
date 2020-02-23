<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<table border="3">
			<th>Employee ID</th>
			<th>Name</th>
			<th>State</th>
			<th>Number</th>
			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.state}</td>
					<td>${employee.number}</td>
					<td><a href="editContact?id=${employee.id}">Edit</a>
						<!--  &nbsp;&nbsp;&nbsp;&nbsp; -->
						<a href="delete?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
</body>
</html>