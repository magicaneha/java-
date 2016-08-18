package pack;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class LoginServlet extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
                String unm=request.getParameter("unm");
                String pass=request.getParameter("pass");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/as3","root","root");
                PreparedStatement ps=con.prepareStatement("select * from student where name =? and password=? ");
                ps.setString(1, unm);
                ps.setString(2, pass);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                 
                    response.sendRedirect("home.html");
                 }
                else
                {
                    response.sendRedirect("loginerror.html");
                
                }
            
        }
        catch(Exception e)
        {
                e.printStackTrace();
                out.print(e);
        }
        finally 
        {            
            
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)    throws ServletException, IOException 
    {
        processRequest(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        processRequest(request, response);
    }

}
