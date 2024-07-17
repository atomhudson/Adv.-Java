

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			ServletContext ctx=getServletContext();
			
			String cn=ctx.getInitParameter("cname");
			String ca=ctx.getInitParameter("caddress");
			out.print("<h1>"+cn+"</h1>");
			out.print("<hr>");
			out.print("<p>Hello Servlet 2</p>");
			out.print("<p>Hi Servlet 2</p>");
			out.print("<hr>");
			out.print("<p>Company Address: "+ca+"</p>");
			out.print("</body>");
			out.print("</html>");
		}catch (Exception e) {
			out.print(e);
		}
	}
}
