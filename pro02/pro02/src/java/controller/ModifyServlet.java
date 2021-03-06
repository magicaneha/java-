
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;


public class ModifyServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)            throws ServletException, IOException 
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
           Student s=new Student();
           s.setRno(Integer.parseInt(rno));
           s.setNm(nm);
           s.setPhy(Integer.parseInt(phy));
           s.setChem(Integer.parseInt(chem));
           s.setMath(Integer.parseInt(math));
           
           if(s.updateStudent())
               out.print("record updated.............<a href=home.html>home</a>");
                    
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
