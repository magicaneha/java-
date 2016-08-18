
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="*"></jsp:setProperty>
<%@include file="check.jsp" %>
<%
    String s2=session.getAttribute("lavel").toString();
    if(!s2.equals("admin"))
    {
        response.sendRedirect("home.jsp");
        return;
    }

%>

<%
        if(s.updateStudent())
            out.print("Record updated..........<a href=home.jsp>home</a>");
        

%>