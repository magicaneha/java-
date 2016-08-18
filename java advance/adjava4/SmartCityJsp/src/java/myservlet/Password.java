/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author paramstudent
 */
@WebServlet(name = "Password", urlPatterns = {"/Password"})
public class Password extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
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
           String opw=request.getParameter("opw");
           String npw=request.getParameter("npw");
           HttpSession session=request.getSession(false);
           String email=(String)session.getAttribute("email");
           Connection con=mycon.MyCon.getCon();
           PreparedStatement pst=con.prepareStatement("update register set pass=? where email=? and pass=?");
              pst.setString(1, npw);
              pst.setString(2, email);
              pst.setString(3, opw);
           int a=pst.executeUpdate();
               if(a==1){
                 PreparedStatement pst1=con.prepareStatement("update login set pass=? where email=? and pass=?");
              pst1.setString(1, npw);
              pst1.setString(2, email);
              pst1.setString(3, opw);
           int b=pst1.executeUpdate();
            if(b==1){
               out.println("<h2>Your Pasword is Successfully update</h2><a href=user_home.html>Home</a>");
            }               
               }
        } catch(Exception e){e.printStackTrace();}
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
