<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./path/{name}" method="POST">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" placeholder="Enter ID"></td>
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
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>