import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Hforms extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("  <h1>FeedBack Forms</h1><hr>");
		try{
			String d=null;
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
			String hid=request.getParameter("hid");
		    Statement st=con.createStatement();
			ResultSet rs1 =st.executeQuery("select dept from hod where hid='"+hid+"'");
			if(rs1.next())
			{do{
				 d=rs1.getString("dept");
			}while(rs1.next());
			}
			PreparedStatement pst=con.prepareStatement("select * from feedback where dept='"+d+"'");
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				out.println("<table border='0' cellpadding='5'");
				out.println("<tr bgcolor='#AA5500'>");				
				out.println("<th>");
				out.println(" Program Name");
				out.println("</th>");
				out.println("<th>");
				out.println("Faculty Name");
				out.println("</th>");
				out.println("<th>");
				out.println("subject Taught");
				out.println("</th>");
				out.println("<th>Click for full Detail");
				out.println("</th>");
				out.println("</tr>");
				boolean b=false;
				do{
					String pn=rs.getString("Program name");
					String nm=rs.getString("fname");
					String s=rs.getString("st");
					if(b)
					out.println("<tr bgcolor='#FBDEC4'>");
					else
					out.println("<tr bgcolor='#FFFFFF'>");
					
				b=!b;
					
					out.println("<td>");
					out.println(pn);
					out.println("</td>");				
					out.println("<td>");
					out.println(nm);
					out.println("</td>");
					out.println("<td>");
					out.println(s);
					out.println("</td>");
				    out.println("<td>");
					out.println("<a href=\"http://localhost:8089/feedback/Ddetail?hid="+hid+"\">View Details</a>");
					out.println("</td>");
					out.println("</tr>");
				}while(rs.next());
				    out.println("</table>");
			}
			rs.close();		
		}catch (Exception e) {		
		out.println(e);
			}	
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
