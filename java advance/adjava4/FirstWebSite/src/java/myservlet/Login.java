package myservlet;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Login extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet call");
        processRequest(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost call");
        processRequest(request,response);
  
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Process method call");
        String email=request.getParameter("em");
        try {
            response.getWriter().println("<h1>Well Come "+email+" </h1>");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service call");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("detroy call");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init call");
    }
    
    
}
