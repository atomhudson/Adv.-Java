<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My Mail Send App</h1>
	<hr>
	<%
		String msg=(String)session.getAttribute("msg");
		if(msg!=null){
	%>
		<p style="background-color: yellow; padding: 10px"> <%= msg %> </p>
	<%		
			session.setAttribute("msg", null);
		}
	%>
	<hr>
	<form action="SendMail" method="post">
		<label>Mail To: </label>
		<input type="email" name="email"  required/> <br/><br/>
		<label>Subject: </label>
		<input type="text" name="subject"  required/> <br/><br/>
		<label>Mail Content: </label>
		<textarea rows="4" name="content" required></textarea> <br/><br/>
		<button>Send Mail</button>
	</form>
	<hr/>
	<form action="SendMsg" method="post">
		<label>To: </label>
		<input type="tel" name="phone"  required/> <br/><br/>
		<label>Message Content: </label>
		<textarea rows="4" name="content" required></textarea> <br/><br/>
		<button>Send Message</button>
	</form>
</body>
</html>