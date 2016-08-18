

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%
HttpSession session=request.getSession(false);
if(session==null)
{
    response.sendRedirect("login.html");
    return;
}
%>
