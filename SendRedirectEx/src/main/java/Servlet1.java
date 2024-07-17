

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Send Redirect Example</h1>");
			out.print("<hr>");
			out.print("<p>Hello Servlet 1</p>");
			String un=request.getParameter("uname");
			System.out.println("User name: "+un);
			response.sendRedirect("s2");
//			response.sendRedirect("Demo.html");
//			response.sendRedirect("https://www.google.com");
			out.print("<p>Bye Servlet 1</p>");
			out.print("</body>");
			out.print("</html>");
		}catch (Exception e) {
			out.print(e);
		}
	}

}
