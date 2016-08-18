package pack;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lohin
 */
public class Lohin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("Text/html");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>WEL-COME</title>");
		out.println("</head>");
		out.println("<boady>");
		out.println("<html>");
		out.println("<h>HELLO</h1>");
		out.println("<a href=>view my profile</a><br>");
		out.println("<a href=>Show All</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
	   
	   
	    }




