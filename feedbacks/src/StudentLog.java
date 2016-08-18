




import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


/**
 * Servlet implementation class StudentLog
 */
public class StudentLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		super.service(request,response);
		response.setContentType("text/html");
		String rno=request.getParameter("rno");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>welCome</head>");
		out.println("<body>");
		try
		{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			out.println("Driver Loaded");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
			out.println("connected");
			PreparedStatement pst=con.prepareStatement("insert into student(rollno)values(?)");
		    pst.setString(1,rno);
		    
		}
		catch(Exception e)
		{
         out.println("Error:"+e);
			e.printStackTrace();
		}
	
		out.println("submitted successfully");
		out.println("<a href=\"\">Feedback Form</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}
	}






