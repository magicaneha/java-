/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import model.*;
/**
 *
 * @author neha
 */
public class UpdateDetail extends HttpServlet {

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
                   
                     Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
            
               first s=new first();
                
              
                s.seteid(eid);
                first s1=s.searchStudent();
          
       
               
                if(s1!=null)
                {
                    out.println("<html><body><form action=Modify> <table align=center>");
                    out.print("<tr><td>Employee_Id</td><td><input type=text name=eid  readonly=true value="+s1.geteid()+"></td></tr>");
                    out.print("<tr><td>First_Name</td><td><input type=text name=fnm value="+s1.getfnm()+"></td></tr>");
                    out.print("<tr><td>Last_name</td><td><input type=text name=lnm value="+s1.getlnm()+"></td></tr>");
                    out.print("<tr><td>Mobile_no.</td><td><input type=text name=mobno value="+s1.getmobno()+"></td></tr>");
                    out.print("<tr><td>Email_Id</td><td><input type=text name=email value="+s1.getemail()+"></td></tr>");
                    out.print("<tr><td>Company_name</td><td><input type=text name=comp value="+s1.getcomp()+"></td></tr>");
                    out.print("<tr><td colspan=2 align=center><input type=submit value=Modify name=modify> </td></tr>");
                    
                    out.print("</table></form></body></html>");
                    
                    
                }
                
                else
                {
                    out.print("Record not found..........<a href=index.jsp>home</a>");
                }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } finally {            
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
