package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Login;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentLog
 */
public class StudentLog extends HttpServlet 
{


  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {    
       int count=0;
       ResultSet rs1 ,rs2;

        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
        
        try 
        {
            String rno=request.getParameter("rno");
           String s=Login.checkLogin(rno);
            if(s!=null)
            {
                    HttpSession session=request.getSession();
                    session.setAttribute("lavel", s);
                response.sendRedirect("feedback.jsp");
            }
            else
            {
                response.sendRedirect("loginerror.html");
            }
            

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
            Statement st=con.createStatement();
PreparedStatement pst=con.prepareStatement("select count from login where rno=?");
pst.setString(1,rno);
ResultSet  rs=pst.executeQuery();
if(rs.next())
{
   int count1=rs.getInt("count");
}

  if(count>5) 
{
  out.println( "Sorry login fail!!!!" );
   }

 else if(count<=0)
{ 
  while(count<6) 
  {
   count=count+1;
   rs1=st.executeQuery("update login set count="+count+"");

   }
}
    else if (count>0)
{ 
  while(count<=5)
  {
   count=count+1;
 rs2 = st.executeQuery("update login set count="+count+"");
   }         
}
else{
        out.println("login fail"); 
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

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
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
