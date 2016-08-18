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
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		
		response.setContentType("text/html");
		String did=request.getParameter("did");
		PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>welCome</head>");
		 out.println("<body>");
		 out.println("View Feedback Forms in order of Departments");
		 out.println("<a href=\"http://localhost:8089/feedback/CsForms\">Computer Science</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/Dforms\">Information Technology</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/EcForms\">Electronics & telecommunication</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/EiForms\">Electronics & instrumental</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/Mforms\">Mechanical</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/Cforms\">Civil</a>");
		 out.println("<a href=\"http://localhost:8089/feedback/Dforms?did="+did+"\">View Feedback Forms</a>");
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
	}

}
