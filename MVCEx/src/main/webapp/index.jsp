<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>MVC Example</h1>
	<hr>
	<h2>Add Numbers:</h2>
	<form action="AddController" method="post">
		<label>Enter 1st No:</label>
		<input type="number" name="num1" required />
		<br/><br/>
		<label>Enter 2nd No:</label>
		<input type="number" name="num2" required />
		<br/><br/>
		<button>Add</button>
	</form>
</body>
</html>