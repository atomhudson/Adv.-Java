<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.incapp.modal.DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String m=(String)session.getAttribute("msg");
		if(m!=null){
	%>
			<p style="background-color:yellow;padding:10px;"> <%=m %> </p>
	<%		
		}
	%>
	<h1>File Uploading Downloading View Example</h1>
	<hr>
	<h3>Upload any file:</h3>
	<form action="FileUpload" method="post" enctype="multipart/form-data">
		<label>Select file:</label>
		<input type="file" name="ufile" accept=".jpg,.png,.pdf,.mp4" required />
		<br><br>
		<button>Submit</button>
	</form>
	<br>
	<hr>
	<h3>Uploaded Files:</h3>
	
	<%
		DAO db=new DAO();
		HashMap<Integer,String> files=db.getAllFiles();
		db.closeConnection();
		
		Set s=files.entrySet();
		for(Object o:s){
			Entry e=(Entry)o;
			int id=(Integer)e.getKey();
			String fn=(String)e.getValue();
			
		%>
			<p> 
				ID: <b><%=id %></b> 
				Name: <b><%=fn %></b> 
				&nbsp;&nbsp;&nbsp;
				<a href="DownloadFile?id=<%=id %>&fn=<%=fn%>">Download</a>
			</p>
		<%
			String a[]=fn.split("\\.");
			String extension=a[1];
			if(extension.equalsIgnoreCase("pdf")){
		%>
				<iframe src="GetFile?id=<%=id %>" height="300px" width="400px"></iframe>
		<%			
			}else if(extension.equalsIgnoreCase("mp4")){
		%>
				<video src="GetFile?id=<%=id %>" height="300px" controls ></video>
		<%			
			}else{
		%>
				<img src="GetFile?id=<%=id %>" height="300px" />
		<%			
			}
		}
	%>
	
</body>
</html>