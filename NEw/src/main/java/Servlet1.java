

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out=null;
		try {
			out=response.getWriter();
			out.print("<html>");
			out.print("<body>");
			ServletContext ctx=getServletContext();
			String cn=ctx.getInitParameter("cname");
			String ca=ctx.getInitParameter("caddress");

			ServletConfig cfg=getServletConfig();
			String n=cfg.getInitParameter("name");
			String p=cfg.getInitParameter("phone")
					;
			out.print("<h1>"+cn+"</h1>");
			out.print("<hr>");
			out.print("<p>Hello Servlet 1</p>");
			out.print("<p>Hi Servlet 1</p>");
			out.print("<p>Developer Details:</p>");
			out.print("<hr>");
			
			out.print("<p>Name: "+n+"</p>");
			out.print("<p>Phone: "+p+"</p>");
			out.print("<hr>");
			out.print("<p>Company Address: "+ca+"</p>");
			
			out.print("</body>");
			out.print("</html>");
		}catch (Exception e) {
			out.print(e);
		}
    }
	

}
