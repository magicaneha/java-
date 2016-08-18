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
import model.first;


public class Modify extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String eid=request.getParameter("eid");
String fnm=request.getParameter("fnm");
String lnm=request.getParameter("lnm");
String mobno=request.getParameter("mobno");
String email=request.getParameter("email");
String comp=request.getParameter("comp");

           first s=new first();
           s.seteid(eid);
s.setfnm(fnm);
s.setlnm(lnm);
s.setmobno(mobno);
s.setemail(email);
s.setcomp(comp);
           
           if((s!=null))
               out.print("record updated.............<a href=index.jsp>home</a>");
                    
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
