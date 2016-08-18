<%-- 
    Document   : country
    Created on : Jan 13, 2014, 5:35:36 PM
    Author     : paramstudent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Country</h1>
        <form action="addcountry.jsp">
            <table border="1">
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="cn" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Add" /></td>
                    </tr>
            </table>
  <%
            String msg=(String)session.getAttribute("msg");
            if(msg!=null){
                out.println(msg);
                session.setAttribute("msg",null);
            }
              %>
        </form>
    </body>
</html>
