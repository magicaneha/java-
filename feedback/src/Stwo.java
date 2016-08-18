

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

/** * Servlet implementation class Stwo
 */
public class Stwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		super.service(request,response);
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		String fpassword=request.getParameter("pw");
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
		    ResultSet rs=st.executeQuery("select fid,password from faculty ");
			if(rs.next())
			{ 
				do{ 
					String id =rs.getString("fid");
					String p=rs.getString("password");
		          	if(id.equals(fid)&& p.equals(fpassword))
		          	{
		          		out.println("you have logged in successfully");
		          		
		          	}
		          	else{
		          		out.println("incorrect id or password");
		          	}
				}while(rs.next());
			}else
			{
				 out.println("you have not logged in earlier");
			}
		    
		}
		catch(Exception e)
		{
         out.println("Error:"+e);
			e.printStackTrace();
		}
	
		
		out.println("<a href=\"http://localhost:8089/feedback/Fforms?fid="+fid+"\">View Feedback Forms</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
