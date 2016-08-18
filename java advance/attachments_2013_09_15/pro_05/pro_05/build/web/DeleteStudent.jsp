

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<jsp:useBean class="model.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="rno"></jsp:setProperty>
<%
    HttpSession session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("login.html");
        return;
    }
    String lavel=session.getAttribute("lavel").toString();
        if(!lavel.equals("admin"))
        {
            response.sendRedirect("home.jsp");
            return;
        }
%>
<%
        if(s.deleteStudent())
            out.print("record deleted.................<a href=home.jsp>home</a>");
        else
            out.print("record not found.................<a href=home.jsp>home</a>");

%>
