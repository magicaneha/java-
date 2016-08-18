

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>

<%
    HttpSession session=request.getSession(false);
    if(session==null)
     {
        response.sendRedirect("login.html");
        return;
    }

String lavel=session.getAttribute("lavel").toString();

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        

        <div align="center">
            <a href="insert.jsp">Insert Student</a><br/>
            <a href="delete.jsp">Delete Student</a><br/>
            <a href="search.jsp">Search Student</a><br/>
            <a href="update.jsp">Update Student</a><br/>
            <a href="getAll.jsp">Get All Student</a><br/>
        </div>

        
        
        
    </body>
</html>
