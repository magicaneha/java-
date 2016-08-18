
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Login;
public class LoginServlet extends HttpServlet 
{


  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
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
                response.sendRedirect("home.jsp");
            }
            else
            {
                response.sendRedirect("loginerror.html");
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
