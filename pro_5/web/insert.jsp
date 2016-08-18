
<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>

<%
try{
    Aurthorized a=new Aurthorized(request, response);
    if(!a.isAdmin())
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
         <div align="right">
        <a href="logout.jsp">logout</a>&nbsp;&nbsp; <a href="home.jsp">home</a>
    </div>
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
<%
    }
    catch(Exception e)
     {
        e.printStackTrace();
    }

%>