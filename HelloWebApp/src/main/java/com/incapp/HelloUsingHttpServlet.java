package com.incapp;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloUsingHttpServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Welcome to My Hello App Using HttpServlet</h1>");
		out.print("<hr>");
		out.print("<p>This is Hello Servlet page</p>");
		out.print("<p>"+LocalDateTime.now()+"</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
