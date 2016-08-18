
<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8"  session="false"%>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="rno"></jsp:setProperty>

<%
try
{
    Aurthorized a=new Aurthorized(request, response);
    if(!a.isAdmin())
    {
            response.sendRedirect("home.jsp");
            return;
    }
    if(s.deleteStudent())
        out.print("Record Deleted...............<a href=home.jsp>home</a>");
    else
        out.print("Record not found...............<a href=home.jsp>home</a>");


   }
    catch(Exception e)
     {
        e.printStackTrace();
    }

%>