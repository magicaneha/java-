package pack;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class SearchServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
                    String rno=request.getParameter("rno");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/as3","root","root");
                    PreparedStatement ps=con.prepareStatement("select * from student where rno= ?");
                    ps.setInt(1,Integer.parseInt(rno));
                    
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                
            out.println("<html> <body><table border=0>");

            out.println("<tr> <td>Roll No</td> <td>"+rs.getString(1) +"</td></tr>");
            out.println("<tr> <td>Name</td> <td>"+rs.getString(2) +"</td></tr>");
            out.println("<tr> <td>Physics</td> <td>"+rs.getInt(3) +"</td></tr>");
            out.println("<tr> <td>Chemistry</td> <td>"+rs.getInt(4) +"</td></tr>");
            out.println("<tr> <td>maths</td> <td>"+rs.getInt(5) +"</td></tr>");
            out.println("<tr> <td>Total</td> <td>"+(rs.getInt(3)+rs.getInt(4)+rs.getInt(5))+"</td></tr>");
        out.println("</table></body></html>");

                
            }
            else
            {
                out.print("record not found ............<a href=home.html>home</a>");
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
