

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Warning@09@");
			PreparedStatement ps = c.prepareStatement("Insert into test value (? , ? )");
			
			String value = request.getParameter("value");
			String value2 = request.getParameter("value2");
			
			ps.setString(1, value);
			ps.setString(1, value2);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.print("<h2>register</h2>");
			}else {
				out.print("<h2>error</h2>");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
