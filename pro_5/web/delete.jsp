

<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<%
    try{
        
        Aurthorized a=new Aurthorized(request, response);
        if(!a.isAdmin())
        {
            response.sendRedirect("home.jsp");
            return;
        }
 
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Page</title>
         <div align="right">
        <a href="logout.jsp">logout</a>&nbsp;&nbsp; <a href="home.jsp">home</a>
    </div>
    </head>
    <body>
        <form action="DeleteStudent.jsp">
            <table border="0">
                <tr> <td>Roll No</td> <td><input type="text" name="rno" value="" /></td>  <td><input type="submit" value="Delete" name="delete" /></td> </tr>

            </table>

        </form>
    </body>
</html>
<%
}
catch(Exception e)
{
    e.printStackTrace();
}

%>