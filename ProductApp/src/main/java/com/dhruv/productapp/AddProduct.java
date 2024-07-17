package com.dhruv.productapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Random random = new Random();
			int randomNumber = random.nextInt();
			
			String productId = Integer.toHexString(randomNumber);
			String productName = request.getParameter("pname");
			String companyName = request.getParameter("cname");
			double productPrice = Double.parseDouble(request.getParameter("pprice"));
			String productDescribtion = request.getParameter("pdescription");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/productapp", "root", "Warning@09@");
			PreparedStatement ps = c.prepareStatement("Insert into products(idproduct,pname,cname,pprice,pdescription) values(?, ?, ?, ?, ?)");
			ps.setString(1, productId);
			ps.setString(2, productName);
			ps.setString(3, companyName);
			ps.setDouble(4, productPrice);
			ps.setString(5, productDescribtion);
			ps.executeUpdate();
			
			
			out.print("<html>");
			out.print("<h1>Added Product</h1><hr>");
			out.print("<h3 style ='color: green'>Product Added Successfully</h3>");
			out.print("<h4 style ='color: blue'>Product Name: "+productName+"</h4>");
			out.print("<h4 style ='color: blue'>Product ID: "+productId+"</h4>");
			out.print("</html>");
			
			c.close();
		} catch (Exception e) {
			out.print("<html>");
			out.print("<h1>Product Not Addedd Successfully!</h1><hr>");
			out.print("<h3 style ='color: red'>Product Not Added Successfully</h3>");
			out.print("<h4 style ='color: red'>Error: "+e+"</h4>");
			out.print("</html>");
		}
		out.close();
	}

}
