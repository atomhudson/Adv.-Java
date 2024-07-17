<%@taglib uri="/WEB-INF/xyz.tld" prefix="my" %>
<%@taglib uri="/WEB-INF/xyz2.tld" prefix="abc" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Custom Tag Example</h1>
	<my:Demo/>
	<p>This is my page</p>
	<my:Demo/>
	<my:Add/>
	<abc:Incapp/>
	<p>Bye Page</p>
</body>
</html>