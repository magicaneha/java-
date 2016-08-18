/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
              String email=request.getParameter("em");
              String pass=request.getParameter("pw");
              String type=request.getParameter("ty");
              String cb=request.getParameter("cb");
            boolean flag=true;
            Cookie car[]=request.getCookies();
              if(car!=null){
                  for (Cookie c : car) {
                      if(c.getName().equals("email")){
                          if(c.getValue().equals(email)){
                              flag=false;
                              System.out.println("Login By Cookie");
                              HttpSession session=request.getSession();
                  session.setAttribute("email",email);
                  if(type.equals("Admin")){
                  response.sendRedirect("admin_home.html");
                  }else{
                  response.sendRedirect("user_home.html");
                      
                  } 
                  
                          }
                      }
                  }
              }  
              if(flag){
            Connection con=mycon.MyCon.getCon();
              PreparedStatement pst=con.prepareStatement("select * from login where email=? and pass=? and type=?");
              pst.setString(1,email);
              pst.setString(2, pass);
              pst.setString(3, type);
              ResultSet rs=pst.executeQuery();
              if(rs.next()){
                  if(cb!=null){
                      Cookie em=new Cookie("email",email);
                      Cookie pw=new Cookie("pass",pass);
                         em.setMaxAge(60*60*24*365);
                         pw.setMaxAge(60*60*24*365);
                      response.addCookie(em);
                      response.addCookie(pw);
                      System.out.println("Cookie Is Created for client");
                  }
                  System.out.println("Login from database");
                  HttpSession session=request.getSession();
                  session.setAttribute("email",email);
                  if(type.equals("Admin")){
                  response.sendRedirect("admin_home.html");
                  }else{
                  response.sendRedirect("user_home.html");
                      
                  }
                  }else{
                out.println("<h1>Invalid user or password<a href=login.html>Try Again</a>");
                
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
