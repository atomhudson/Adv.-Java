package com.dhruv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		try {
			Random random = new Random();
			int randomNumber = random.nextInt();
			String userId = Integer.toHexString(randomNumber);
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int age = Integer.parseInt(request.getParameter("age"));
			String phone = request.getParameter("phone");
			String gender = request.getParameter("gender");
			String address = request.getParameter("address");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersapp", "root", "Warning@09@");
			PreparedStatement psmt = c.prepareStatement("INSERT INTO users(idusers, name, email, age, phone, gender, adrress) VALUES (?, ?, ?, ?, ?, ?, ?)");
			psmt.setString(1, userId);
			psmt.setString(2, name);
			psmt.setString(3, email);
			psmt.setInt(4, age);
			psmt.setString(5, phone);
			psmt.setString(6, gender);
			psmt.setString(7, address);
			psmt.executeUpdate();

			out.println("<html>");
			out.println("<h2>Add User APP</h2>");
			out.println("<p style='color: green;'>Data Added Successfully</p>");
			out.println("</html>");
		} catch (SQLIntegrityConstraintViolationException e) {
			out.print("<html><h2>User App</h2><hr><p style = 'color: red;'>User Already Exists</p></html>");
		} catch (Exception ee) {
			out.print("<html>");
			out.print("<h1>Product Not Addedd Successfully!</h1><hr>");
			out.print("<h3 style ='color: red'>Product Not Added Successfully</h3>");
			out.print("<h4 style ='color: red'>Error: "+ee+"</h4>");
			out.print("</html>");
		}

	}

}
