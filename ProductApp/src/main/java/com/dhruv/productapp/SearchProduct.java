package com.dhruv.productapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			String pname = request.getParameter("pname");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/productapp", "root", "Warning@09@");
			PreparedStatement ps = c.prepareStatement("Select * from products where pname like ?");
			ps.setString(1,"%"+pname+"%");
			
			ResultSet rs = ps.executeQuery();
			
			
			ArrayList<HashMap<String, Object>> products = new ArrayList<>();
			boolean flag = true;
			
			while(rs.next()) {
				flag = false;
				
				String pro_id = rs.getString("idproduct");
				String pro_name = rs.getString("pname");
				String pro_com_name = rs.getString("cname");
				Double pro_price = rs.getDouble("pprice");
				String pro_description = rs.getString("pdescription");
				
				HashMap<String, Object> product = new HashMap<>();
				product.put("Product id", pro_id);
				product.put("Product name", pro_name);
				product.put("Company name", pro_com_name);
				product.put("Product price", pro_price);
				product.put("Product Description", pro_description);
				
				products.add(product);
			}
			if(flag) {
				response.sendRedirect("UserNotFound.html");
			}else {
				request.setAttribute("products", products);
				RequestDispatcher rd = request.getRequestDispatcher("PrintUser");
				rd.forward(request, response);
			}
		c.close();
		} catch (Exception e) {
			out.print(e);
		}
		out.close();
	
	}

}
