
<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<%@page import="java.sql.*"  %>           


<%
try
{
        Aurthorized a=new Aurthorized(request, response);
        if(!a.isValid())
        {
            response.sendRedirect("login.html");
            return;
        }


    ResultSet rs=s.getAllStudent();
    

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <div align="right">
        <a href="logout.jsp">logout</a>&nbsp;&nbsp; <a href="home.jsp">home</a>
    </div>
    </head>
    <body>
        <table border="0">
            <thead>
                <tr>   <th>Roll No</th> <th>Name</th><th>Physics</th><th>Chemistry</th><th>Maths</th><th>Total</th> </tr>
            </thead>
            <tbody>
                
                <%
                while(rs.next())
                       {
%>
<tr><td><%=rs.getString(1) %></td> <td><%=rs.getString(2) %></td>  <td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td> <td><%=rs.getString(5) %></td><td><%=(rs.getInt(3)+rs.getInt(4)+rs.getInt(5)) %></td> </tr>
                
                <% }%>
                
            </tbody>
        </table>

    </body>
</html>
<%
    }
    catch(Exception e)
     {
        e.printStackTrace();
    }

%>