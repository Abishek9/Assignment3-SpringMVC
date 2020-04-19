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
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee">
			Employee ID : <input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="submit" value="Search">
		</form>
	</fieldset>
</body>
</html>