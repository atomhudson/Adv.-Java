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
	<h1>Custom Tag with Attribute Example</h1>
	<p>This is my page</p>
	<my:Add num1='90' num2='80'/>
	<my:Add num1='780' />
	<my:Add num1='780' num2='690'/>
	<p>Bye Page</p>
</body>
</html>