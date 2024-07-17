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
	<%
	String s1=request.getParameter("num1");
	String s2=request.getParameter("num2");
	Integer result=(Integer)request.getAttribute("result");
	%>
	<p>Sum of <b><%=s1 %></b> and <b><%=s2 %></b> = <b><%=result %></b> </p>
</body>
</html>