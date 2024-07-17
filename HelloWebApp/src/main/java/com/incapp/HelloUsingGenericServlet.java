package com.incapp;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloUsingGenericServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Welcome to My Hello App Using Generic Servlet</h1>");
		out.print("<hr>");
		out.print("<p>This is Hello Servlet page</p>");
		out.print("<p>"+LocalDateTime.now()+"</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
