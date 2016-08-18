

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<jsp:useBean class="model.Student"  id="s"></jsp:useBean>
<jsp:setProperty name="s" property="*" ></jsp:setProperty>
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
    if(s.updateStudent())
    {
        out.print("Record updated..........<a href=home.jsp>home</a>");
        return;
    }


%>