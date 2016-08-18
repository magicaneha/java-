/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author neha
 */
public class updaterecord extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String eid=request.getParameter("eid");
String fnm=request.getParameter("fnm");
String lnm=request.getParameter("lnm");
String mno=request.getParameter("mno");
String email=request.getParameter("email");
String comp=request.getParameter("comp");

    

       Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
            
            PreparedStatement ps2=con.prepareStatement("update employeedetails set fnm= ? , lnm= ? ,  mno= ? ,  email= ? ,comp= ? where eid = ? ");
              
            
          
            ps2.setString(1,eid);
               ps2.setString(2,fnm);
                  ps2.setString(3,lnm);
                     ps2.setString(4,mno);
                     ps2.setString(5,email);
                ps2.setString(6,comp);        
            int i=ps2.executeUpdate();
            if(i>0)
            {
                   out.print("record updated.....<a href=insert.jsp>HOME</a>");
            }
           
         
            }
        
        
 catch(Exception e)
        {
            e.printStackTrace();
            out.print(e);
                  
        }
  

finally {            
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
