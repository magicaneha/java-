<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%> 
<%
    try
    {
        Aurthorized a=new Aurthorized(request, response);
        if(!a.isValid())
        {
            response.sendRedirect("login.html");
            return;
        }
        
        a.logout();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }


%>
