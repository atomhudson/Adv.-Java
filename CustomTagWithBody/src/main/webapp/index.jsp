<%@taglib uri="/WEB-INF/xyz.tld" prefix="my" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Custom Tag with Body Example</h1>
	<p>This is my page</p>
	<my:Add num1='80' num2='40'>
		<p>Hello INDIA</p>
	</my:Add>
	<p>Bye Page</p>
</body>
</html>