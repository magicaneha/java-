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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paramstudent
 */
public class Register extends HttpServlet {

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
            String un=request.getParameter("un");
            String em=request.getParameter("em");
            String pw=request.getParameter("pw");
            String dd=request.getParameter("dd");
            String mm=request.getParameter("mm");
            String yyyy=request.getParameter("yyyy");
            String gn=request.getParameter("gn");
            String mob=request.getParameter("mob");
            String ct=request.getParameter("ct");
            String add=request.getParameter("add");
            Connection con=mycon.MyCon.getCon();
            PreparedStatement pst=con.prepareStatement("insert into register(uname,email,pass,dob,gender,mobno,city,address) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, un);
            pst.setString(2, em);
            pst.setString(3, pw);
            pst.setString(4, yyyy+"-"+mm+"-"+dd);
            pst.setString(5, gn);
            pst.setString(6, mob);
            pst.setString(7,ct);
            pst.setString(8, add);
            int a=pst.executeUpdate();
            if(a==1){
            PreparedStatement pst1=con.prepareStatement("insert into login(email,pass) values(?,?)");
            pst1.setString(1, em);
            pst1.setString(2, pw);
               int b= pst1.executeUpdate();
                if(b==1){
                    out.println("<h1> "+un+" Are Successfully Register <a href=login.html>Login</a></h1>");
                }
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
