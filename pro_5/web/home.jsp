


<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<%
    try
    {
        
    Aurthorized a=new Aurthorized(request, response);
    if(!a.isValid())
    {
        response.sendRedirect("login.html");
        return;
    }


%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    <div align="right">
        <a href="logout.jsp">logout</a>&nbsp;&nbsp; <a href="home.jsp">home</a>
    </div>
    </head>
    <body>

        <div align="center">
            <a href="insert.jsp">Insert Student</a><br/>
            <a href="delete.jsp">Delete Student</a><br/>
            <a href="search.jsp">Search Student</a><br/>
            <a href="update.jsp">Update Student</a><br/>
            <a href="getAll.jsp"> get All Student</a><br/>
        </div>

    </body>
</html>
<%
    }
    catch(Exception e)
     {
        e.printStackTrace();
    }

%>