<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<form action="./added" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="number" name="id" placeholder="Enter ID"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" placeholder="Enter name"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" placeholder="Enter email"></td>
			</tr>
			<tr>
				<td>salary</td>
				<td><input type="number" name="salary" placeholder="Enter salary"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password" placeholder="Enter password"></td>
			</tr>
			<tr>
				<td>deptId</td>
				<td><input type="number" name="deptId" placeholder="Enter Dept ID"></td>
			</tr>
			<tr>
				<td>mobile no</td>
				<td><input type="text" name="mobileno" placeholder="Enter Mobile No"></td>
			</tr>
			<tr>
				<td>joining date</td>
				<td><input type="date" name="joiningDate" placeholder="Enter joining date"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>