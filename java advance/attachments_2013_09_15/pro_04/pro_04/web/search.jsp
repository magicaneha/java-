

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%
    HttpSession session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("login.html");
        return;
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <form action="SearchStudent.jsp">
           <table border="0">
                
               <tr> <td>Roll No</td><td><input type="text" name="rno" value="" /></td><td><input type="submit" value="Search" name="search" /></td></tr>
                
            </table>

            
        </form>
    </body>
</html>
