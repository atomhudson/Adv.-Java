package com.dhruv;

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
 * Servlet implementation class SearchUser
 */
@WebServlet("/SearchUser")
public class SearchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("search");
		PrintWriter out= response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersapp", "root", "Warning@09@");
			PreparedStatement ps = c.prepareStatement("SELECT * FROM users where name like ? ");
			ps.setString(1, "%"+name+"%");
			ResultSet rs = ps.executeQuery();
			boolean flag = true;
			
			out.print("<html>");
			out.print("<head><title>USER APP</title></head>");
			out.print("<h1>Searched Person</h1>");
			out.print("<body>");
			
			while(rs.next()) {
				flag = false;
				out.print("<div style = 'background-color: yellow' margin: 10px padding: 10px>");
				out.print("<h3> UserId: "+rs.getString("idusers")+"</h3>");
				out.print("<h3> Name: "+rs.getString("name")+"</h3>");
				out.print("<h3> Email: "+rs.getString("email")+"</h3>");
				out.print("<h3> Age: "+rs.getInt("age")+"</h3>");
				out.print("<h3> Phone Number: "+rs.getString("phone")+"</h3>");
				out.print("<h3> Gender: "+rs.getString("gender")+"</h3>");
				out.print("<h3> Address: "+rs.getString("adrress")+"</h3>");
				out.print("</div>");
			}
			
			out.print("</body>");
			out.print("</html>");
			if(flag) {
				out.print("<html>");
				out.print("<body>");
				out.print("<h1>Searched Person</h1><hr>");
				out.print("<h3 style:'color: read'>Not exists in our database</h3>");
				out.print("</body>");
				out.print("</html>");
			}
			
		} catch (Exception e) {
			out.print("<html>");
			out.print("<h1>Product Not Addedd Successfully!</h1><hr>");
			out.print("<h3 style ='color: red'>Product Not Added Successfully</h3>");
			out.print("<h4 style ='color: red'>Error: "+e+"</h4>");
			out.print("</html>");
		}
	}

}
