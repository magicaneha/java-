package package1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Login;

/**
 * Servlet implementation class StudentLog
 */
public class Sfour extends HttpServlet 
{


  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String did=request.getParameter("did");
            String password=request.getParameter("password");
            
            
        try 
        {
            
            
           
        String s= Login.checkdirector( did ,password );
            if(s!=null)
            {
                    HttpSession session=request.getSession();
                    session.setAttribute("lavel", s);
                //response.sendRedirect("Dforms.java");
                    out.println("you have logged in successfully");
                    out.println("<a href=logout.jsp>logout</a> ");
                    out.println("<a href=Dform?did='"+did+"'>View Details</a>");
					
		out.println("</body>");
		out.println("</html>");
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
