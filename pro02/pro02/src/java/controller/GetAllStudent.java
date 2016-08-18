
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

public class GetAllStudent extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            Student s=new Student();
            ResultSet rs=s.getAllStudent();
            out.print("<html><body><table>");
            out.print("<thead><th>Roll No</th><th>Name</th><th>Physics</th><th>Chemistry</th><th>Maths</th><th>Total</th><th></th></thead>");
            while(rs.next())
            {
            out.print("<tr><td>"+rs.getString(1) +"</td><td>"+rs.getString(2) +"</td><td>"+rs.getString(3) +"</td><td>"+rs.getString(4) +"</td><td>"+rs.getString(5) +"</td><td>"+(rs.getInt(3)+rs.getInt(4)+rs.getInt(5))+"</td></tr>");
            }
            out.print("</table></body></html>");
            
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
