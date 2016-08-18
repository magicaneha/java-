
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class InsertServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)           throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String rno=request.getParameter("rno");
            String nm=request.getParameter("nm");
            String phy=request.getParameter("phy");
            String chem=request.getParameter("chem");
            String math=request.getParameter("math");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(rno));
            ps.setString(2, nm);
            ps.setInt(3, Integer.parseInt(phy));
            ps.setInt(4, Integer.parseInt(chem));
            ps.setInt(5, Integer.parseInt(math));
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                    out.print("record inserted.....<a href=home.html>home</a>");
            }
            
                
            
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
            out.print(e);
                   out.print("..............<a href=home.html>home</a>");
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
