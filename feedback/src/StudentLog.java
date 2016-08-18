




import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
			
			Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select rollno from student ");
		if(rs!=null)
		{
			do{
			String rollno=rs.getString("rollno");
			}while(rno.equals("rollno"));
		 out.println("Submitted Successfully");
		}
		else{
			out.println("no data found");
		}
		
		 }
		catch(Exception e)
		{
         out.println("Error:"+e);
			e.printStackTrace();
		}
	 
	

		out.println("<br><a href=\"http://localhost:8089/feedback/feedback.html?rno="+rno+"\">Feedback Form</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}
	}






