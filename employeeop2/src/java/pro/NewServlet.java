
package pro;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yash
 */
public class NewServlet extends HttpServlet {

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
            String cnm=request.getParameter("cnm");
            String s=request.getServerName();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            
           if(request.getParameter("add")!=null)
           {
            PreparedStatement ps=con.prepareStatement("insert into ssplab values(?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(eid));
            ps.setString(2, fnm);
            ps.setString(3, lnm);
            ps.setString(4, mno);
            ps.setString(5, email);
            ps.setString(6, cnm);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                    out.print("record inserted....."+s);
            }
          
    }
        
        
        if(request.getParameter("update")!=null)
        {
           PreparedStatement ps=con.prepareStatement("update ssplab set fnm=? , lnm=? , mno=? , email=? , cnm=? where eid=?");
            ps.setInt(6, Integer.parseInt(eid));
            ps.setString(1, fnm);
            ps.setString(2, lnm);
            ps.setString(3, mno);
            ps.setString(4, email);
            ps.setString(5, cnm);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                    out.print("record updated....."+s);
            }
            else
            { out.print("Record not found");
            }
            
        }
        
        if(request.getParameter("delete")!=null)
        {
            PreparedStatement ps=con.prepareStatement("delete from ssplab where eid=?");
            ps.setInt(1, Integer.parseInt(eid));
            int i=ps.executeUpdate();
            if(i>0)
            {
                    out.print("record deleted....."+s);
            }
            else out.print("Record not found");
        }
        }  catch(Exception e)
        {
            e.printStackTrace();
            out.print(e);
                   out.print("error");
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
