


package package1;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class FeedbackServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)           throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String feedback=request.getParameter("feedbid");
            String course=request.getParameter("course");
            String fac=request.getParameter("fac");
            String batch=request.getParameter("batch");                    
            String sub=request.getParameter("sub");
            String marks=request.getParameter("marks");
            String code=request.getParameter("code");
            String ca=request.getParameter("ca");
            String date=request.getParameter("date");
            String department=request.getParameter("department");
            
            
            
            String a1=request.getParameter("a1");
            String a2=request.getParameter("a2"); 
            String a3=request.getParameter("a3");
            String a4=request.getParameter("a4");
            String a5=request.getParameter("a5");
            String a6=request.getParameter("a6");
            String a7=request.getParameter("a7");
            String a8=request.getParameter("a8");
            String a9=request.getParameter("a9"); 
            String a10=request.getParameter("a10");
                   
            String b1=request.getParameter("b1");
            String b2=request.getParameter("b2");
            String b3=request.getParameter("b3");
            String b4=request.getParameter("b4");
            String b5=request.getParameter("b5");
            
            String c1=request.getParameter("c1");
            String c2=request.getParameter("c2");
            String c3=request.getParameter("c3");
                   
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
            PreparedStatement ps=con.prepareStatement("insert into feedbackform values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,feedback);
            ps.setString(2, course);
            ps.setString(3, fac);
            ps.setString(4, batch);
            ps.setString(5, sub);
            ps.setString(6, code);
            ps.setString(7,marks );
            ps.setString(8,ca );
            ps.setString(10,date);
            
            ps.setString(9,department);
            
            ps.setString(11,a1 );
            ps.setString(12,a2 );
            ps.setString(13,a3 );
            ps.setString(14,a4 );
            ps.setString(15,a5 );
            ps.setString(16,a6 );
            ps.setString(17,a7 );
            ps.setString(18,a8);
            ps.setString(19,a9 );
            ps.setString(20,a10 );
          
            
            ps.setString(21,b1 );
            ps.setString(22,b2 );
            ps.setString(23,b3 );
            ps.setString(24,b4);
            ps.setString(25,b5);
                       
            ps.setString(26,c1 );
            ps.setString(27,c2 );
            ps.setString(28,c3 );
            
            
            
            
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                    out.print("record inserted.....<a href=login.html>HOME</a>");
            }
            
                
            
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
            out.print(e);
                  
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
