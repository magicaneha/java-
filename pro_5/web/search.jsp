

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
        

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
         <div align="right">
        <a href="logout.jsp">logout</a>&nbsp;&nbsp; <a href="home.jsp">home</a>
    </div>
    </head>
    <body>
        <form action="SearchStudent.jsp">
            <table border="0">
                <tr> <td>Roll No</td> <td><input type="text" name="rno" value="" /></td>  <td><input type="submit" value="search" name="search" /></td> </tr>

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