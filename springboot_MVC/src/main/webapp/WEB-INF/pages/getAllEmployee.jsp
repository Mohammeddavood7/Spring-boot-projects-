<%@page import="com.dvd.model.Employee,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
  table {
      margin:5px;
      text-align: center;
      width:100%;
      
  }
  
</style>
<body>
	<table border="1">
		<tr>
			<td>Employee Id</td>
			<td>Employee Name</td>
			<td>Employee Address</td>
			<td>Employee Salary</td>
		</tr>
		<%
		List<Employee> emp = (List<Employee>) request.getAttribute("emp");
		for (Employee e : emp) {
		%>
		<tr>
			<td><%=e.getEmpId()%></td>
			<td><%=e.getEmpName()%></td>
			<td><%=e.getEmpAddress()%></td>
			<td><%=e.getEmpSal()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>