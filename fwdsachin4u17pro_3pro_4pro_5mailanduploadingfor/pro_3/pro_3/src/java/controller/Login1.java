
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Login;
public class Login1 extends HttpServlet 
{


  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try 
        {
            String unm=request.getParameter("unm");
            String pass=request.getParameter("pass");
            boolean flag=Login.checkLogin(unm, pass);
            if(flag)
            {
                    HttpSession session=request.getSession();
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
