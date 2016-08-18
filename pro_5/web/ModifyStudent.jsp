
<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="*"></jsp:setProperty>

<%
try{
    
Aurthorized a=new Aurthorized(request, response);
    if(!a.isAdmin())
    {
        response.sendRedirect("home.jsp");
        return;
    }

        if(s.updateStudent())
            out.print("Record updated..........<a href=home.jsp>home</a>");

}
catch(Exception e)
{
    e.printStackTrace();
}             

%>