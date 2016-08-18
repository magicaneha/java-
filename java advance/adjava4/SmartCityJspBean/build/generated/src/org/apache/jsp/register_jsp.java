package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 align=\"center\">Well Come Register</h1>\r\n");
      out.write("        <form action=\"Register\" method=\"post\">\r\n");
      out.write("  <table width=\"506\" border=\"1\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"179\" ><strong>Name</strong></td>\r\n");
      out.write("      <td width=\"311\"><input type=\"text\"  name=\"un\" id=\"un\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Email</td>\r\n");
      out.write("      <td><input type=\"email\" id=\"em\" name=\"em\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Password</td>\r\n");
      out.write("      <td><input type=\"password\" id=\"pw\" name=\"pw\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>DOB</td>\r\n");
      out.write("      <td><select name=\"dd\" id=\"dd\">\r\n");
      out.write("        <option>DD</option>\r\n");
      out.write("        ");
for(int i=1;i<=31;i++){
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        <select name=\"mm\" id=\"mm\">\r\n");
      out.write("          <option>MM</option>\r\n");
      out.write("           ");
for(int i=1;i<=12;i++){
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write(" </select>\r\n");
      out.write("        <select name=\"yyyy\" id=\"yyyy\">\r\n");
      out.write("         <option>YYYY</option>\r\n");
      out.write("          ");
for(int i=1915;i<=2014;i++){
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("      </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Gender</td>\r\n");
      out.write("      <td>\r\n");
      out.write("    <p>\r\n");
      out.write("          <input type=\"radio\" name=\"gn\" id=\"gn\" value=\"male\" />\r\n");
      out.write("      MALE</p>\r\n");
      out.write("      <p>\r\n");
      out.write("      <input type=\"radio\" name=\"gn\" id=\"gn\" value=\"female\"/>\r\n");
      out.write("      FEMALE</p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Mobno</td>\r\n");
      out.write("      <td><input type=\"number\" name=\"mob\" id=\"mob\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>City</td>\r\n");
      out.write("      <td><select name=\"ct\" id=\"ct\">\r\n");
      out.write("        <option>indore</option>\r\n");
      out.write("        <option>delhi</option>\r\n");
      out.write("        <option>mumbai</option>\r\n");
      out.write("        <option>mandsaur</option>\r\n");
      out.write("        <option>chennai</option>\r\n");
      out.write("        <option>srinagr</option>\r\n");
      out.write("        <option>banglore</option>\r\n");
      out.write("        <option>ahemdabad</option>\r\n");
      out.write("        <option>pune</option>\r\n");
      out.write("        <option>shimla</option>\r\n");
      out.write("        <option>hyderabad</option>\r\n");
      out.write("        <option>lucknow</option>\r\n");
      out.write("        <option>agra</option>\r\n");
      out.write("        <option>dhar</option>\r\n");
      out.write("        <option>newyork</option>\r\n");
      out.write("        <option>paris</option>\r\n");
      out.write("        <option>losangles</option>\r\n");
      out.write("        <option>london</option>\r\n");
      out.write("        <option>switzerland</option>\r\n");
      out.write("      </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Address</td>\r\n");
      out.write("      <td><textarea name=\"add\" id=\"add\" cols=\"25\" rows=\"3\"></textarea></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Code</td>\r\n");
      out.write("      <td></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Click For Registration</td>\r\n");
      out.write("      <td><input type=\"submit\" id=\"new\" name=\"new\" value=\"submit\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <h3 style=\"font:italic\">* optional</h3>\r\n");
      out.write("</form>\r\n");
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
