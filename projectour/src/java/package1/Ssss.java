


package package1;






import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Login1;
import java.sql.*;

public class Ssss extends HttpServlet 
{


  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        String fid=request.getParameter("fid");
            String password=request.getParameter("password");
            
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try 
        {
            
           
        String s1=Login1.checkfaculty( fid ,password );
            if(s1!=null)
            {
                    HttpSession session=request.getSession();
                    session.setAttribute("lavel", s1);
                //response.sendRedirect("Fforms");
                    //out.println("you have logged in successfully");
                    response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("  <h1>FeedBack Forms</h1><hr>");
                out.println("<a href=logout.jsp>logout</a> ");
		try{
			String fname=null;
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
			//String fid=request.getParameter("fid");
                        
                        // PreparedStatement ps=con.prepareStatement("select fid from faculty");
			Statement st=con.createStatement();
                       	ResultSet rs1 =st.executeQuery("select fname from faculty where fid='"+fid+"'");
                        
			
			if(rs1.next())
			{
				 fname=rs1.getString("fname");
                                 
			
			}
			PreparedStatement pst=con.prepareStatement("select * from feedbackform where fac='"+fname+"'");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
                            
                            
                            
                             
			
				out.println("<table border='0' cellpadding='4'");
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
					String pn=rs.getString("course");
					String nm=rs.getString("fac");
					String s=rs.getString("sub");
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
					out.println("<a href=Detail?fid="+rs.getString(1) +">View Details</a>");
					out.println("</td>");
					out.println("<td>");
					
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
            else
            {
                out.println("incorrect id or password");
                //response.sendRedirect("loginerror.html");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {            
            out.close();
        }
    }
}
    
