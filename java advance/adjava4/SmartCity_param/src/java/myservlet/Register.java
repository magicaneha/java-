/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
              
            String name=request.getParameter("name");
            String email=request.getParameter("em");
            String pass=request.getParameter("pw");
            String contactno=request.getParameter("cn");
              String gender=request.getParameter("gen");
              String country=request.getParameter("cntry");
              String state=request.getParameter("st");
              
              String city=request.getParameter("cty");
              Connection con=mycon.MyCon.getCon();
              PreparedStatement pst=con.prepareStatement("select * from Register where name=? and email=? and pass=?  and contactno=? and gender=? and country=? and state=? and city=?");
              pst.setString(1,name);
              pst.setString(2, email);
              
              pst.setString(3, pass);
              pst.setString(4, contactno);
              pst.setString(5, gender);
              pst.setString(6, country);
              pst.setString(7, state);
              pst.setString(8, city);
              ResultSet rs=pst.executeQuery();
              if(rs.next()){
                  response.sendRedirect("admin_home.html");
              }else{
                out.println("<h1>Invalid user or password<a href=login.html>Try Again</a>");
                
              }
            }catch(Exception e){e.printStackTrace();} 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
