
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


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
    </head>
    <body>
        <form action="InsertStudent.jsp">
            <table border="0" align="center">
                <tr><td>Roll No</td> <td><input type="text" name="rno" value="" /></td></tr>
                <tr><td>Name</td> <td><input type="text" name="nm" value="" /></td></tr>
                <tr><td>Physics</td> <td><input type="text" name="phy" value="" /></td></tr>
                <tr><td>Chemistry</td> <td><input type="text" name="chem" value="" /></td></tr>
                <tr><td>Maths</td> <td><input type="text" name="math" value="" /></td></tr>
                <tr><td colspan="2" align="center"><input type="submit" value="Insert" name="insert" /></td></tr>

            </table>

        </form>
    </body>
</html>
