<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
<form action="./loginEmp">

<input type="submit" value="Logout" style="background: green; color: white; float: right;">
</form>
<br>
<br>
<fieldset>
		<legend>Delete Employee</legend>
		<form action="./deleteEmployee">
			Employee ID : <input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="submit" value="Delete">
		</form>
	</fieldset>

</body>
</html>