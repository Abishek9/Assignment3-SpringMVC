<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Employee</title>
</head>
<body>

<h1 style="color: blue;">Login Form</h1>
<fieldset>
		<legend>Login Employee</legend>
		<form action="./loginEmployee">
			Employee ID : <input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp;  <br>
			Employee Password : <input type="password" name="password" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			<input type="submit" value="Login">
		</form>
	</fieldset>

</body>
</html>