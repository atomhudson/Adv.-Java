package com.dhruv.productapp;

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
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
    	try {
    		String id = request.getParameter("id");
    		String password = request.getParameter("Password");
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/productapp", "root", "Warning@09@");
    		PreparedStatement ps = c.prepareStatement("select * from login where id = ? and password = ?");
    		ps.setString(1, id);
    		ps.setString(2, password);
    		
    		ResultSet rs = ps.executeQuery();
    		
    		if(rs.next()) {
    			String name = rs.getString("name");
    			HttpSession session = request.getSession();
    			session.setAttribute("name", name);
    			response.sendRedirect("AdminHome");
    		}else {
    			response.sendRedirect("LoginError.html");
    		}	
    		
    		c.close();
		} catch (Exception e) {
			out.print(e);			
		}
    	out.close();
    }

}
