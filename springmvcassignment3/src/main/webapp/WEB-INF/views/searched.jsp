<%@page import="com.capgemini.sprinmvc.bean.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%EmployeePrimaryInfo info = (EmployeePrimaryInfo)request.getAttribute("bean"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(info!=null){ %>
<div align ="center">
<table border="1" style="width:70%">
<tr style = "background:navy; color:white;">
<th>id</th>
<th>name</th>
<th>email</th>
<th>deptId</th>
<th>mobileno</th>
<th>salary</th>
<th>joiningDate</th>
</tr>
<tr>
<td><%=info.getId() %></td>
<td><%=info.getName() %></td>
<td><%=info.getEmail() %></td>
<td><%=info.getDeptId()%></td>
<td><%=info.getMobileno() %></td>
<td><%=info.getSalary() %></td>
<td><%=info.getJoiningDate() %></td>
</tr>
</table>
</div>
<%} %>
</body>
</html>