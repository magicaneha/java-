package package1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** * Servlet implementation class Sfour
 */
public class Dform extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(request, response);
		
		response.setContentType("text/html");
		String did=request.getParameter("did");
		PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>welCome</head>");
		 out.println("<body>");
                 out.println("<a href=logout.jsp>logout</a><br> ");
		 out.println("View Feedback Forms in order of Departments<br>");
		 out.println("<a href=Csforms?did='"+did+"'>Computer Science</a><br>");
		 out.println("<a href=Iforms?did='"+did+"'>Information Technology></a><br>");
		 out.println("<a href=Ecforms?did='"+did+"'>Electronics & telecommunication></a><br>");
		 out.println("<a href=Eiforms?did='"+did+"'>Electronics & instrumental></a><br>");
		 out.println("<a href=Mforms?did='"+did+"'>Mechanical</a>");
		 out.println("<a href=Cforms?did='"+did+"'>Civil</a>");
		
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
	}

}
