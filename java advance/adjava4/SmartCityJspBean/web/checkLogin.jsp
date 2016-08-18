<%-- 
    Document   : checkLogin
    Created on : Jan 15, 2014, 5:32:54 PM
    Author     : paramstudent
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="l" class="dto.Login" scope="page"></jsp:useBean>
        <jsp:setProperty name="l" property="*"></jsp:setProperty>
        
     <%
     Connection con=mycon.MyCon.getCon();
     PreparedStatement pst=con.prepareStatement("select * from login where email=? and pass=? and type=?");
     pst.setString(1, l.getEm());
     pst.setString(2,l.getPw());
     pst.setString(3, l.getTy());
     ResultSet rs=pst.executeQuery();
     if(rs.next()){
         session.setAttribute("email",l.getEm());
         if(l.getTy().equals("Admin")){
             response.sendRedirect("admin_home.jsp");
         }else{
             response.sendRedirect("user_home.jsp");
         }
     }else{
         session.setAttribute("msg","Invalid user or password...!");
         response.sendRedirect("login.jsp");
     }
     %>
    </body>
</html>
