<%-- 
    Document   : addcountry
    Created on : Jan 13, 2014, 5:39:00 PM
    Author     : paramstudent
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
     <%
     Connection con=mycon.MyCon.getCon();
       Statement st=con.createStatement();
       String name=request.getParameter("cn");
  int a=st.executeUpdate("insert into country(name) values('"+name+"')");
        if(a==1){
            session.setAttribute("msg","Country Successfulyy Add");
            response.sendRedirect("country.jsp");
        }      
    %>
         <h1>Select country</h1>
        <select>
            
            <%
            <option> <%= name%> </option>
             %>       
        </select>
    </body>
</html>
