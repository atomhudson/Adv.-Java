package com.dhruv.productapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

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

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			ServletContext ctx=getServletContext();
			Integer count=(Integer)ctx.getAttribute("count");
			if(count==null) {
				count=0;
			}
			ctx.setAttribute("count", ++count);
			
			ArrayList<HashMap<String, Object>> products = (ArrayList<HashMap<String,Object>>)request.getAttribute("products");
			
			out.print("<html>");
			out.print("<head><title>PRODUCT APP</title></head>");
			out.print("<h1>Searched Product</h1>");
			out.print("<h4> Search Count: "+count+"<h4>");
			out.print("<body>");
			
			
			for(HashMap<String, Object> product: products) {
				String pid = (String) product.get("Product id");
				String pname = (String) product.get("Product name");
				String cname = (String) product.get("Company name");
				Double pprice = (Double) product.get("Product price");
				String pdescription = (String) product.get("Product Description");
				
				
				out.print("<hr><div style = 'background-color: yellow' margin: 10px padding: 10px>");
				out.print("<h3> ProductId: "+pid+"</h3>");
				out.print("<h3> Product Name: "+pname+"</h3>");
				out.print("<h3> Company Name: "+cname+"</h3>");
				out.print("<h3> Product Price: "+pprice+"</h3>");
				out.print("<h3> Product Description: "+pdescription+"</h3>");
				out.print("</div>");
				
			}
			out.print("</body>");
			out.print("</html>");
		} catch (Exception e) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Error Occured</h1><hr>");
			out.print("<h4 style ='color: red'>Error: "+e+"</h4>");
			out.print("</body>");
			out.print("</html>");
		}
		out.close();
	}

}
