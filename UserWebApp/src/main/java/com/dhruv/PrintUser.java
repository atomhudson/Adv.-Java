package com.dhruv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintUser
 */
@WebServlet("/PrintUser")
public class PrintUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			
			//Search Counter
			ServletContext ctx=getServletContext();
			Integer count=(Integer)ctx.getAttribute("count");
			if(count==null) {
				count=0;
			}
			ctx.setAttribute("count", ++count);
			//END- Search Counter
			
			
			out=response.getWriter();
			String n=request.getParameter("name");
			
			//JDBC code
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/userapp","root","incapp");
			PreparedStatement p=c.prepareStatement("select * from users where name like ?");
			p.setString(1,"%"+n+"%");
			ResultSet rs=p.executeQuery();
			boolean flag=true;
			ArrayList<HashMap<String, Object>> users=new ArrayList<>();
			while(rs.next()) {
				flag=false;
				
				String name=rs.getString("name");
				String email=rs.getString("email");
				String phone=rs.getString("phone");
				int age=rs.getInt("age");
				String gender=rs.getString("gender");
				String address=rs.getString("address");
				
				HashMap<String, Object> user=new HashMap<>();
				user.put("name", name);
				user.put("email", email);
				user.put("phone", phone);
				user.put("age", age);
				user.put("gender", gender);
				user.put("address", address);
				
				users.add(user);
			}
			if(flag){
				response.sendRedirect("UserNotFound.html");
			}else {
				request.setAttribute("users", users);
				RequestDispatcher rd=request.getRequestDispatcher("PrintUser");
				rd.forward(request, response);
			}
			
		}catch (Exception e) {
			out.print(e);
		}
	}
}
