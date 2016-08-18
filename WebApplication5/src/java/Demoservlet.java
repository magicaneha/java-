import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demoservlet extends HttpServlet {

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, 
IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    ServletContext sc = getServletContext();
    sc.setAttribute("capital", "new delhi ");
    out.print("<br>country name is " + sc.getInitParameter("country"));

    out.print("<br>company name is " + sc.getInitParameter("cname"));

  }
}