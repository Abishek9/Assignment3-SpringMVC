<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>

<form action="./loginEmp">

<input type="submit" value="Logout" style="background: green; color: white; float: right;">
</form>
<br>
<br>
<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployee">
			Employee ID : <input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp; <br>
			Employee Name : <input type="text" name="name" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 

			<br>
			
			Employee Email : <input type="text" name="email" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			
			Employee Dept Id : <input type="text" name="deptId" >
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			
			Employee MobileNo : <input type="text" name="mobileno" >
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			
			Employee Salary : <input type="text" name="salary">
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			Employee Joining Date : <input type="text" name="joiningDate">
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<br>
			<input type="submit" value="Update">
		</form>
		
		
		
	</fieldset>
	
	<br>

</body>
</html>