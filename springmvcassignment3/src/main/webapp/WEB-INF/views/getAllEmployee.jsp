<%@page import="java.util.List"%>
<%@page import="com.capgemini.sprinmvc.bean.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% List<EmployeePrimaryInfo> info = (List<EmployeePrimaryInfo>)request.getAttribute("list"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="./loginEmp">

<input type="submit" value="Logout" style="background: green; color: white; float: right;">
</form>
<br>
<br>
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
<% for(EmployeePrimaryInfo empinfo : info) { %>
<tr>
<td><%=empinfo.getId() %></td>
<td><%=empinfo.getName() %></td>
<td><%=empinfo.getEmail() %></td>
<td><%=empinfo.getDeptId()%></td>
<td><%=empinfo.getMobileno() %></td>
<td><%=empinfo.getSalary() %></td>
<td><%=empinfo.getJoiningDate() %></td>
</tr>
<%} %>
</table>
</div>
<%} %>
</body>
</html>