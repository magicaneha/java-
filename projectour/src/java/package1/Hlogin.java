package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Login2;
import java.sql.*;
/**
 * Servlet implementation class StudentLog
 */
public class Hlogin extends HttpServlet{


  String hid; 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         hid =request.getParameter("hid");
         String password=request.getParameter("password");
         
                  
          try{
        String s2=Login2.checkhod( hid ,password );
            if(s2!=null)
            {
                    HttpSession session=request.getSession();
                    session.setAttribute("lavel", s2);
            }
           
            
                    response.setContentType("text/html");
                     out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("  <h1>FeedBack Forms</h1><hr>");
                out.println("<a href=logout.jsp>logout</a> ");
            
            try{    
			String d=null;
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");

		    Statement st=con.createStatement();
			ResultSet rs1 =st.executeQuery("select department from hod where hid='"+hid+"'");
			if(rs1.next())
			{
				 d=rs1.getString("department");
			}
			
                        
			PreparedStatement pst=con.prepareStatement("select * from feedbackform where department=?");
                        pst.setString(1,d);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
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
					out.println("<a href=Hdetail?hid="+rs.getString(3) +">View Details</a>");
				
                                        out.println("</td>");
					out.println("</tr>");
				}while(rs.next());
				    out.println("</table>");
			}
                       
			rs.close();		
            }
          catch (Exception e) {		
		out.println(e);
			}			
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	

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

    
//   protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
//  {
//        String hid=null;
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try
//        {
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//          
//					
//    	out.println("<a href=Hforms.java?hid='"+hid+"'> View Feedback Forms</a>");
//        out.println(hid);
//       
//                      out.println("</body>");		out.println("</html>");
//		out.close();
////	}

}
