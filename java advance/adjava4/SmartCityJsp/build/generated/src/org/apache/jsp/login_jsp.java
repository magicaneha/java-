package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>User</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylesheet.css\"\r\n");
      out.write("              type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 align=\"center\">Well Come Login</h1>\r\n");
      out.write("        <form action=\"Login\" method=\"post\">\r\n");
      out.write("        <table align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Email</td>\r\n");
      out.write("                    <td><input type=\"email\" name=\"em\"  id=\"em\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Password</td>\r\n");
      out.write("                    <td><input type=\"password\" name=\"pw\" id=\"pw\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Type</td>\r\n");
      out.write("                    <td><select name=\"ty\" id=\"ty\" class=\"myc\">\r\n");
      out.write("                           ");

                           Connection con=mycon.MyCon.getCon();
                           Statement st=con.createStatement();
                           ResultSet rs=st.executeQuery("select distinct type from login");
                              ArrayList list=new ArrayList();
                              while(rs.next()){
                                  list.add(rs.getString(1));
                              }
                           con.close();
                         Iterator i=list.iterator();                                                    
                             while(i.hasNext()){
                               
      out.write("\r\n");
      out.write("                               <option>");
      out.print(i.next());
      out.write("</option>    \r\n");
      out.write("                               \r\n");
      out.write("                               ");
}
      out.write("\r\n");
      out.write("                        </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><a href=\"register.jsp\">Sign Up</a></td>\r\n");
      out.write("                    <td><input type=\"submit\" value=\"Login\" class=\"myc\"/>Remember Me<input type=\"checkbox\" name=\"cb\" value=\"ON\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("            ");

            String msg=(String)session.getAttribute("msg");
            if(msg!=null){
                out.println(msg);
                session.setAttribute("msg",null);
            }
              
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
