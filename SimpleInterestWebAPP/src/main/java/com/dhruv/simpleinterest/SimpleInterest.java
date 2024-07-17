package com.dhruv.simpleinterest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/interestForm")
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SimpleInterest() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pa = request.getParameter("principal");
		String air = request.getParameter("rate");
		String tp = request.getParameter("time");
		PrintWriter out = response.getWriter();
		try {
			int principal_amount = Integer.parseInt(pa);
			int rate_of_interest = Integer.parseInt(air);
			int time_period = Integer.parseInt(tp);
			int interest = (principal_amount * rate_of_interest * time_period) / 100;
			int totalAmount = principal_amount + interest;
			
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Simple Interset Calculator</h1>");
			out.print("<hr/>");
			out.print("<h3>Total Ammount: "+totalAmount+"</h3>");
			out.print("</body>");
			out.print("</html>");
			
		} catch (Exception e) {
			out.print(e);
		}
		out.close();
	}
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	String pa = req.getParameter("principal");
//		String air = req.getParameter("rate");
//		String tp = req.getParameter("time");
//		PrintWriter out = resp.getWriter();
//		try {
//			int principal_amount = Integer.parseInt(pa);
//			int rate_of_interest = Integer.parseInt(air);
//			int time_period = Integer.parseInt(tp);
//			int interest = (principal_amount * rate_of_interest * time_period) / 100;
//			int totalAmount = principal_amount + interest;
//			
//			out.print("<html>");
//			out.print("<body>");
//			out.print("<h1>Simple Interset Calculator</h1>");
//			out.print("<hr/>");
//			out.print("<h3>Total Ammount: "+totalAmount+"</h3>");
//			out.print("</body>");
//			out.print("</html>");
//			
//		} catch (Exception e) {
//			out.print(e);
//		}
//		out.close();
//
//    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pa = request.getParameter("principal");
		String air = request.getParameter("rate");
		String tp = request.getParameter("time");
		PrintWriter out = response.getWriter();
		try {
			int principal_amount = Integer.parseInt(pa);
			int rate_of_interest = Integer.parseInt(air);
			int time_period = Integer.parseInt(tp);
			int interest = (principal_amount * rate_of_interest * time_period) / 100;
			int totalAmount = principal_amount + interest;
			
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Simple Interset Calculator</h1>");
			out.print("<hr/>");
			out.print("<h3>Total Ammount: "+totalAmount+"</h3>");
			out.print("</body>");
			out.print("</html>");
			
		} catch (Exception e) {
			out.print(e);
		}
		out.close();

	}
}
