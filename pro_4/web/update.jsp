

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="check.jsp" %>
<%
    String s=session.getAttribute("lavel").toString();
    if(!s.equals("admin"))
    {
        response.sendRedirect("home.jsp");
        return;
    }

%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <form action="UpdateStudent.jsp">
            <table border="0">
                <tr> <td>Roll No</td> <td><input type="text" name="rno" value="" /></td>  <td><input type="submit" value="Update" name="update" /></td> </tr>

            </table>

        </form>
    </body>
</html>
